class Parent {
    int num;

    Parent(int num) {
        this.num = num; //Поле суперкласс
    }

    void display() {
        System.out.println("Метод суперкласса: " + num);
    }
}

class Child extends Parent {
    int num;

    Child(int childNum, int parentNum) {
        super(parentNum); //Обращение к конструктору суперкласса
        this.num = childNum; //Поле подкласса
    }

    void show() {
        System.out.println("Поле подкласса: " + num);
        System.out.println("Поле суперкласса: " + super.num); //Доступ к полю суперкласса
        super.display(); //Доступ к методу суперкласса
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.show();
        /*
        Поле подкласса: 10
        Поле суперкласса: 20
        Метод суперкласса: 20
        */
    }
}
