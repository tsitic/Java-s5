/*
Если класс реализует два интерфейса, в которых есть одинаковые неабстрактные методы, то при компиляции возникнет ошибка
Компилятор не сможет определить, какую реализацию использовать
Чтобы разрешить эту проблему в классе нужно просто переопредлить методы
*/


interface InterfaceA {

    default void show() {
        System.out.println("from InterfaceA");
    }
}

interface InterfaceB {

    default void show() {
        System.out.println("from InterfaceB");
    }
}

class A implements InterfaceA, InterfaceB {

    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("from class A");
    }
}

public class Main {

    public static void main(String[] args) {
        A obj = new A();

        obj.show();
    }
}
