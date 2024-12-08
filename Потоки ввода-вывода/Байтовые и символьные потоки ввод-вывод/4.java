/*
AutoCloseable название говорит само за себя, он закрывает файлы, потоки, сетевые соединения и т.д. после завершения их использования
*/

//Класс FileInputStream реализует AutoCloseable (через Closeable).
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("read.txt")) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        //Закрытие ресурса происходит автоматически
    }
}
