import java.util.ArrayList;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This feature is deprecated");
    }
    
    void newFeature() {
        System.out.println("This is the new feature");
    }
}

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
        
        ArrayList rawList = new ArrayList();
        rawList.add("Unchecked warning suppressed");
        System.out.println(rawList.get(0));
    }
}

