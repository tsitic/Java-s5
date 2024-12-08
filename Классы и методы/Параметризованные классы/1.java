class Wrapper<T> {  //класс из примера
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}


public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> int1 = new Wrapper<>();
        Wrapper<Integer> int2 = new Wrapper<>();
        Wrapper<String> strWrapper = new Wrapper<>();

        if (int1 instanceof Wrapper) {
            System.out.println("int1 is Wrapper");
        }

        if (int2 instanceof Wrapper) {
            System.out.println("int2 is Wrapper");
        }

        if (strWrapper instanceof Wrapper) {
            System.out.println("strWrapper is Wrapper");
        }
    }
}
