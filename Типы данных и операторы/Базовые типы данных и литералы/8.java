public class Main {

    public static void main(String[] args) {
        var animal = new Dog(); // Использование var
        animal.makeSound();
    }
}

interface Animal {

    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Gav-Gav");
    }
}
