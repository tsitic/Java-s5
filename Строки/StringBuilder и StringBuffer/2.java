public class StringConversion {
    public static void main(String[] args) {
        //Преобразование String -> StringBuilder
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sb);
        //Преобразование String -> StringBuffer
        StringBuffer sf = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sf);
        //Преобразование StringBuilder -> String
        String strFromSB = sb.toString();
        System.out.println("StringBuilder to String: " + strFromSB);
        //Преобразование StringBuffer -> String
        String strFromSF = sf.toString();
        System.out.println("StringBuffer to String: " + strFromSF);
        //Преобразование StringBuilder -> StringBuffer
        StringBuffer sfFromSB = new StringBuffer(sb);
        System.out.println("StringBuilder to StringBuffer: " + sfFromSB);
        //Преобразование StringBuffer -> StringBuilder
        StringBuilder sbFromSF = new StringBuilder(sf);
        System.out.println("StringBuffer to StringBuilder: " + sbFromSF);
    }
}
