public enum Season {
    WINTER("-10* С"),
    SPRING("14* С"),
    SUMMER("25* С"),
    AUTUMN("14* С");

    private final String tempr;

    Season(String tempr) {
        this.tempr = tempr;
    }

    public String gettempr() {
        return tempr;
    }
}

public class Main {
    public static void main(String[] args) {
        Season season = Season.WINTER;

        System.out.println("Season: " + season);
        System.out.println("t: " + season.gettempr());

        // Перебор всех
        for (Season s : Season.values()) {
            System.out.println(s + ": " + s.gettempr());
        }
    }
}
