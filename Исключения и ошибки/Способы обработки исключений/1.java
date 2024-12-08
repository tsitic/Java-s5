public class Main {
    public static void main(String[] args) {
        try {
            // Первое исключение - будет перехвачено
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Второе исключение - приведет к аварийной остановке
        int[] arr = new int[5];
        arr[10] = 100; // ArrayIndexOutOfBoundsException
    }
}
