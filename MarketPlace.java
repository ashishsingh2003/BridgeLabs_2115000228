import java.util.*;

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}

class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Category: " + product.getCategory());
        }
    }
}

public class Marketplace {
    public static void main(String[] args) {
        Product<String> book = new Product<>("Java Programming", 40.0, "Science");
        Product<String> shirt = new Product<>("Casual Shirt", 25.0, "Mens");
        Product<String> phone = new Product<>("Smartphone", 500.0, "Mobile");

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.showCatalog();

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.showCatalog();
    }
}

