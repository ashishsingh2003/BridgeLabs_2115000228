class Process {
    int processId, burstTime, priority;
    Process next;

    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    void removeProcess(int processId) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                if (prev != null) prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void simulateRoundRobin() {
        if (head == null) return;
        Process temp = head;
        int totalTime = 0, totalWaitingTime = 0, totalTurnAroundTime = 0, processCount = 0;
        
        do {
            int executionTime = Math.min(temp.burstTime, timeQuantum);
            temp.burstTime -= executionTime;
            totalTime += executionTime;
            if (temp.burstTime == 0) {
                totalTurnAroundTime += totalTime;
                removeProcess(temp.processId);
            }
            temp = temp.next;
        } while (head != null);
        
        double avgWaitingTime = (double) totalWaitingTime / processCount;
        double avgTurnAroundTime = (double) totalTurnAroundTime / processCount;
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnAroundTime);
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
