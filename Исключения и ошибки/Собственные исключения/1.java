public class MyException extends Exception { //наследуем от Exception
    //Конструктор без параметров
    public MyException() {
        super("I dont like 1+1 pls not do it");
    }
    //Конструктор с сообщением
    public MyException(String message) {
        super(message);
    }
    //Конструктор с сообщением и причиной
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}


public class Main {
    public static int plus(int a, int b) throws MyException {
        if (a == 1 && b == 1) {
            throw new MyException("I dont like 1+1 pls not do it");
        }
        return a + b;
    }
  
    public static void main(String[] args) {
        try {
            int result = plus(1, 1); //Попытка сложить 1 + 1
            System.out.println("result: " + result);
        } catch (MyException e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            int result = plus(2, 3); //Попытка сложить другие числа
            System.out.println("result: " + result);
        } catch (MyException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
//Вывод:
//result: I dont like 1+1 pls not do it
//result: 5
