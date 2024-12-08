class Sum {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();

        System.out.println(sum.add(2, 3));  //5
        System.out.println(sum.add(1, 2, 3)); //6
        System.out.println(sum.add(1.5, 2.5));  //4.0
    }
}

