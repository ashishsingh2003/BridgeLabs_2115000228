public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isavailable;

    public Book2(String title, String author, double price, boolean isavailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isavailable = isavailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    public boolean borrowBook() {
        if (isavailable) {
            isavailable = false;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }
}

