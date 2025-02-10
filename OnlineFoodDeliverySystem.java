import java.util.*;

abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    double applyDiscount(double discountRate);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount(double discountRate) {
        return calculateTotalPrice() * (1 - discountRate / 100);
    }

    public String getDiscountDetails() {
        return "Veg item discount applied.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 1.2;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity * ADDITIONAL_CHARGE;
    }

    public double applyDiscount(double discountRate) {
        return calculateTotalPrice() * (1 - discountRate / 100);
    }

    public String getDiscountDetails() {
        return "Non-veg item discount applied.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        double discountRate = 10;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println("Price after Discount: " + discountable.applyDiscount(discountRate));
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println();
        }
    }
}
