//ПРИМЕР ПЕРГРУЗКИ МЕТОДА
class A {
    int sum(int x, int y) {
        return x + y;
    }

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    double sum(double x, double y) {
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.sum(1, 2));       // 3
        System.out.println(a.sum(1, 2, 3));   // 6
        System.out.println(a.sum(1.5, 2.5));  // 4.0
    }
}
