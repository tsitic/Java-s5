class Parent {
    void say_hello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    void say_hello() { //Переопределение метода
        System.out.println("Hello from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        obj1.say_hello(); 
        obj2.say_hello(); 
    }
}

//Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?//

/*
Произодет ошибка компиляции НО в случаее если возвращаемое переопредленное значение имеет тип подкласса значения возвращаемого суперклассом
 (например суперкласс возваращает Number, а под класс Integer) то все будет нормально 
*/
