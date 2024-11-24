public class Main {

    public static void main(String[] args) {
        int num = 43;
        double pi = 3.14;
        boolean flag = true;

        Object obj = new Object();

        String str_int = "my num: " + num;
        String str_double = "Pi is " + pi;
        String str_bool = "flag is " + flag;
        String str_obj = "WOW! Object " + obj;

        System.out.println(str_int); 
        System.out.println(str_double); 
        System.out.println(str_bool); 
        System.out.println(str_obj); 
    }
}
//РЕЗУЛЬТАТ ВЫВОД//
/*
my num: 43
Pi is 3.14
flag is true
WOW! Object java.lang.Object@38102d01
*/
