import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("README.txt");

            Scanner fileScanner = new Scanner(file);

            // Чтение данных построчно
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line); 
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("not found: " + e.getMessage());
        }
    }
}
