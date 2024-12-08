import java.util.Formatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(); 

        try (Formatter formatter = new Formatter()) {
            formatter.format("hour: %tH%n", date);  
            formatter.format("Minutes: %tM%n", date);                
            formatter.format("second: %tS%n", date);         
            formatter.format("year: %tY%n", date);     
            formatter.format("Month name: %tB%n", date);   

            //Вывод форматированного текста
            System.out.println(formatter);
        }
    }
}
