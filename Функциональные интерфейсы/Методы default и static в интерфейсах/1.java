interface MyInterface {
    default void defaultMethod() {
        System.out.println("default interface");
    }

    static void staticMethod() {
        System.out.println("static interface");
    }
}

class A implements MyInterface {
    //Переопределение default метода
    @Override
    public void defaultMethod() {
        System.out.println("default in class");
    }

    //Дополнительный метод для вызова default метода интерфейса
    public void callSuperDefault() {
        MyInterface.super.defaultMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        //Вызов переопределенного default метода из класса
        obj.defaultMethod();
        //Вызов оригинального default метода интерфейса
        obj.callSuperDefault();
        //Вызов статического метода интерфейса
        MyInterface.staticMethod();
    }
}

