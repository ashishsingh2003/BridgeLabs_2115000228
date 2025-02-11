class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

class TextEditor {
    private TextState current;
    private int maxHistory;
    private int historySize;

    TextEditor(int maxHistory) {
        this.maxHistory = maxHistory;
        this.historySize = 0;
        this.current = new TextState("");
    }

    void addState(String newText) {
        TextState newState = new TextState(newText);
        newState.prev = current;
        if (current != null) current.next = newState;
        current = newState;
        historySize++;
        trimHistory();
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrentState() {
        System.out.println("Current State: " + (current != null ? current.content : ""));
    }

    private void trimHistory() {
        if (historySize > maxHistory) {
            TextState temp = current;
            while (historySize > maxHistory && temp.prev != null) {
                temp = temp.prev;
                historySize--;
            }
            temp.prev = null;
        }
    }
}

