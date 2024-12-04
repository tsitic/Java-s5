public class Main {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a;
        System.out.println("int -> byte: " + b); // -126 

        double x = 9.99;
        int y = (int) x;
        System.out.println("double -> int: " + y); // 9 

    }
}
