public class Main {

    public static void main(String[] args) {
        Object obj = "Это строка"; 
        String str = "Пример строки";
        Object nullObj = null;

        if (obj instanceof String) {
            System.out.println("obj is not String.");
        }

        //с null-объектом
        if (!(nullObj instanceof String)) {
            System.out.println("nullObj is not String.");
        }
    }
}
