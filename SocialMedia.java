import java.util.ArrayList;

class User {
    int userId, age;
    String name;
    ArrayList<Integer> friendIds;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head = null;

    void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    void addFriend(int userId1, int userId2) {
        User user1 = searchById(userId1);
        User user2 = searchById(userId2);
        if (user1 != null && user2 != null && !user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    void removeFriend(int userId1, int userId2) {
        User user1 = searchById(userId1);
        User user2 = searchById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    void findMutualFriends(int userId1, int userId2) {
        User user1 = searchById(userId1);
        User user2 = searchById(userId2);
        if (user1 != null && user2 != null) {
            System.out.print("Mutual Friends: ");
            for (int id : user1.friendIds) {
                if (user2.friendIds.contains(id)) {
                    System.out.print(id + " ");
                }
            }
            System.out.println();
        }
    }

    void displayFriends(int userId) {
        User user = searchById(userId);
        if (user != null) {
            System.out.print("Friends of " + user.name + ": ");
            for (int id : user.friendIds) {
                System.out.print(id + " ");
            }
            System.out.println();
        }
    }

    User searchById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    void searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            }
            temp = temp.next;
        }
    }

    void countFriends(int userId) {
        User user = searchById(userId);
        if (user != null) {
            System.out.println("Total Friends of " + user.name + ": " + user.friendIds.size());
        }
    }
}

