
public class Main {

    public static void main(String[] args) {
        // 1  присваивания
        int a = 10;
        a += 5; 
        a -= 3; 
        a *= 2; 
        a /= 4; 
        a %= 3;

        // 2 тернарный 
        int b = (a > 0) ? 1 : -1;

        // 3 логические
        boolean x = true, y = false;
        boolean result = x || y; 
        result = x && y; 

        // 4 битовые
        int c = 5;  // 0101 
        int d = 3;  // 0011 
        int bitOr = c | d;  //  0101 | 0011 = 0111
        int bitXor = c ^ d; // 0101 ^ 0011 = 0110
        int bitAnd = c & d; // 0101 & 0011 = 0001

        // 5 сравнение 
        boolean result = (c == d); 
        boolean result = (c != d); 
        boolean result = (c > d); 
        boolean result = (c < d); 
        boolean result = (c >= d);
        boolean result = (c <= d); 

        // 6 сдвиги побитовые
        int b_Right = c >> 1;  
        int unsign_bRight = c >>> 1; 
        int b_Left = c << 1;  

        // 7 арефметические
        int sum = c + d;
        int diff = c - d;
        int result = c * d;
        int result = c / d;
        int result = c % d;

        // 8. Инкремент и декремент
        int e = 5;
        int prefInc = ++e; 
        int postfInc = e++; 
        int prefDec = --e; 
        int postfDec = e--; 

        // 9 префиксы постфиксы и побитовые 
        int negative = -c;
        int positive = +c;
        int bitNot = ~c; // Побитовое НЕ
        boolean logNot = !x; // Логическое НЕ

        // 10 приоритеты
        int complex = (a + b) * (c - d);

        // 11 Индексация
        int[] array = {1, 2, 3};
        int firstEl = array[0];

        // 12 строки
        String str1 = "Hello";
        String str2 = "World";
        String str1_str2 = str1 + " " + str2;
    }
}
