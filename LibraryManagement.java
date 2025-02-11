class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}

class LibraryManagement {
    private Book head = null, tail = null;

    void addBookAtBeginning(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    void addBookAtEnd(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void addBookAtPosition(int bookId, String title, String author, String genre, boolean isAvailable, int position) {
        if (position == 1) {
            addBookAtBeginning(bookId, title, author, genre, isAvailable);
            return;
        }
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        Book temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) temp.next.prev = newBook;
        temp.next = newBook;
        if (newBook.next == null) tail = newBook;
    }

    void removeBookById(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp == tail) tail = temp.prev;
        }
    }

    void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println(temp.bookId + ", " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + (temp.isAvailable ? "Available" : "Not Available"));
            }
            temp = temp.next;
        }
    }

    void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println(temp.bookId + ", " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + (temp.isAvailable ? "Available" : "Not Available"));
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + ", " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + ", " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    int countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

