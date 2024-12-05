public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("oh Nooo... i = " + i);
                    break; // Прерывает только внутренний цикл
                }
                System.out.println("i = " + i + ", j = " + j);  
            }
        }
        //вывод: все возможные комбинации i и j кроме тех, где j = 3

        System.out.println("\nПример с continue:");

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; //пропускает для четных i переходит к следующей итерации
            }
            System.out.println(i); //вывод: 1, 3, 5
        }
    }
}
