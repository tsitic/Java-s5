//ПРИМЕР ПЕРЕОПРЕДЕЛЕНИЯ МЕТОДА
class B {
    void on() {
        System.out.println("Включение устройства");
    }
}

class Phone extends B {
    @Override//ПЕРЕОПРЕДЕЛЯЕМ МЕТОД ИЗ B
    void on() {
        System.out.println("Телефон разблокирован");
    }
}

class TV extends B {
    @Override//ПЕРЕОПРЕДЕЛЯЕМ МЕТОД ИЗ B
    void on() {
        System.out.println("Телевизор включен");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        B phone = new Phone();
        B tv = new TV();

        b.on();       // Включение устройства
        phone.on();   // Телефон разблокирован
        tv.on();      // Телевизор включен
    }
}
