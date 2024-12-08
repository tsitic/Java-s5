public class printNum {
        public static void display(int... numbers) {
        System.out.println("Num (int):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void display(String... strings) {
        System.out.println("Str:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display(1, 2, 3, 4);               // Вызов метода с int
        display("Hello", "Word");          // Вызов метода с String
    }
}
