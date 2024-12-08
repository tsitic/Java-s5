import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        //Разделитель
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("A").add("B").add("C");
        System.out.println(joiner1); // "A, B, C"

        //Префикс и суффикс
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("A").add("B");
        System.out.println(joiner2); // "[A, B]"

    }
}
