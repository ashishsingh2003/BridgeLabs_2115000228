class Item {
    String itemName;
    int itemId, quantity;
    double price;
    Item next;

    Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagement {
    private Item head = null;

    void addItemAtBeginning(int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    void addItemAtEnd(int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    void addItemAtPosition(int itemId, String itemName, int quantity, double price, int position) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        if (position == 1) {
            addItemAtBeginning(itemId, itemName, quantity, price);
            return;
        }
        Item temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeItemById(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head, prev = null;
        while (temp != null && temp.itemId != itemId) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) prev.next = temp.next;
    }

    void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println(temp.itemId + ", " + temp.itemName + ", " + temp.quantity + ", " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }

    void searchByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName)) {
                System.out.println(temp.itemId + ", " + temp.itemName + ", " + temp.quantity + ", " + temp.price);
            }
            temp = temp.next;
        }
    }

    double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    void sortByNameAscending() {
        head = mergeSort(head, true);
    }

    void sortByPriceAscending() {
        head = mergeSortByPrice(head, true);
    }

    private Item mergeSort(Item head, boolean ascending) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(head, ascending);
        Item right = mergeSort(nextToMiddle, ascending);
        return sortedMerge(left, right, ascending);
    }

    private Item mergeSortByPrice(Item head, boolean ascending) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByPrice(head, ascending);
        Item right = mergeSortByPrice(nextToMiddle, ascending);
        return sortedMergeByPrice(left, right, ascending);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item sortedMerge(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        if ((ascending && a.itemName.compareTo(b.itemName) < 0) || (!ascending && a.itemName.compareTo(b.itemName) > 0)) {
            a.next = sortedMerge(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, ascending);
            return b;
        }
    }

    private Item sortedMergeByPrice(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        if ((ascending && a.price < b.price) || (!ascending && a.price > b.price)) {
            a.next = sortedMergeByPrice(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMergeByPrice(a, b.next, ascending);
            return b;
        }
    }
}

