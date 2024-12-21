class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class ExceptionPractice1 {
    public static void throwException(int code) throws Ex1, Ex2, Ex3 {
        switch (code) {
            case 1:
                throw new Ex1("this is Ex1");
            case 2:
                throw new Ex2("this is Ex2");
            case 3:
                throw new Ex3("this is Ex3");
            default:
                System.out.println("Никакое исключение не выброшено.");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            try {
                throwException(i);
            }
              
            catch (Ex3 e) {
                System.out.println("catch Ex3. msg: " + e.getMessage());
            } 
              
            catch (Ex2 e) {
                System.out.println("catch Ex2. msg: " + e.getMessage());
            
            catch (Ex1 e) {
                System.out.println("catch Ex1. msg: " + e.getMessage());
            }
        }
    }
}

