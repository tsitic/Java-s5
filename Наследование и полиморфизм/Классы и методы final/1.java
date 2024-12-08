class Parent {
    final void show() {
        System.out.println("Final метод суперкласса");
    }
}

class Child extends Parent {
    // Ошибка: нельзя переопределить final метод
    // void show() {
    //     System.out.println("Переопределение запрещено");
    // }
}

