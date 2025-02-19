import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        sortedByPrice.computeIfAbsent(productPrices.get(product), k -> new ArrayList<>()).add(product);
    }

    public void displayCartByInsertionOrder() {
        System.out.println("Shopping Cart (Insertion Order):");
        cart.forEach((product, quantity) -> 
            System.out.println(product + " -> Quantity: " + quantity + ", Price: $" + productPrices.get(product))
        );
    }

    public void displayCartSortedByPrice() {
        System.out.println("Shopping Cart (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> Price: $" + entry.getKey() + ", Quantity: " + cart.get(product));
            }
        }
    }

    public double calculateTotal() {
        return cart.entrySet().stream()
                   .mapToDouble(entry -> productPrices.get(entry.getKey()) * entry.getValue())
                   .sum();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.50);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Orange", 2.00);
        cart.addProduct("Grapes", 3.50);

        cart.addToCart("Apple", 3);
        cart.addToCart("Banana", 5);
        cart.addToCart("Orange", 2);
        cart.addToCart("Grapes", 1);

        cart.displayCartByInsertionOrder();
        System.out.println();
        cart.displayCartSortedByPrice();
        System.out.println("\nTotal Price: $" + cart.calculateTotal());
    }
}

