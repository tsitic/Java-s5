class Parent {
    void say_hello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    void say_hEEEEllo() { //Ошибка в написании метода
        System.out.println("Hello from Child");
    }
}

/*
При попытке вызвать say_hello у Child получим сообщение об ошибки.
Если бы @Override не было бы то компилятор бы Воспринимал say_hEEEEllo не как переопределенный метод, а как отдельный метод Child
*/
