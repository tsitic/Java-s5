public class ClassA {
    // Вложенный статический класс
    public static class NestedClass {

        public void func() {
            System.out.println("NestedClass");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        ClassA.NestedClass nestedObject = new ClassA.NestedClass();
        nestedObject.func();
    }
}
