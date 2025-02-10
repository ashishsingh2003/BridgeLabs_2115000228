import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    
    public abstract int getLoanDuration();
    
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;
    
    public Book(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }
    
    public int getLoanDuration() {
        return 14;
    }
    
    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
    
    public Magazine(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }
    
    public int getLoanDuration() {
        return 7;
    }
    
    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;
    
    public DVD(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }
    
    public int getLoanDuration() {
        return 5;
    }
    
    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    
    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Programming", "John Doe", true));
        items.add(new Magazine("M202", "Tech Weekly", "Jane Smith", true));
        items.add(new DVD("D303", "Inception", "Christopher Nolan", true));
        
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                if (reservable.reserveItem()) {
                    System.out.println("Item reserved successfully.");
                } else {
                    System.out.println("Item is already reserved.");
                }
            }
            System.out.println();
        }
    }
}

