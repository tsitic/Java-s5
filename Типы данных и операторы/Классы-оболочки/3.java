public class Main {

    public static void main(String[] args) {
        Integer i = null; 
        int value = i; 

    }
}


/*
Тексь ошибки:
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "i" is null
	at Main.main(Main.java:7)
*/
