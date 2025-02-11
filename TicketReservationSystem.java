class Ticket {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null, tail = null;
    private int totalTickets = 0;

    void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        totalTickets++;
    }

    void removeTicket(int ticketId) {
        if (head == null) return;
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                if (prev != null) prev.next = temp.next;
                totalTickets--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchTicketByCustomer(String customerName) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket Found - Ticket ID: " + temp.ticketId + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void searchTicketByMovie(String movieName) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket Found - Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Seat: " + temp.seatNumber);
            }
            temp = temp.next;
        } while (temp != head);
    }

    int getTotalTickets() {
        return totalTickets;
    }
}

