public class Main {
    public static void main(String[] args) {
        //Метод length():возвращает длину строки
        String str = "Hello, Word!";
        System.out.println(str.length()); // 12

        //Метод charAt() возвращает символ по индексу
        System.out.println(str.charAt(0)); // 'H'

        //Метод substring() возвращает подстроку
        System.out.println(str.substring(7)); // "Word!"

        //Метод toUpperCase() преобразует строку в верхний регистр
        System.out.println(str.toUpperCase()); // "HELLO, WORD!"

        //Метод toLowerCase() преобразует строку в нижний регистр
        System.out.println(str.toLowerCase()); // "hello, word!"

        //Метод replace() заменяет все вхождения одной подстроки на другую
        System.out.println(str.replace("Word", "Oaiai")); // "Hello, Oaiai!"

        //Метод contains() проверяет, содержит ли строка заданную подстроку
        System.out.println(str.contains("Word")); // true

        //Метод indexOf() возвращает индекс первого вхождения символа или подстроки
        System.out.println(str.indexOf('W')); // 7

        //Метод isEmpty() проверяет, пустая ли строка
        String emptyStr = "";
        System.out.println(emptyStr.isEmpty()); // true

        //Метод trim() удаляет начальные и конечные пробелы
        String strWithSpaces = "   Hello!   ";
        System.out.println(strWithSpaces.trim()); // "Hello!"
    }
}

