public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Cat");
        StringBuffer sf = new StringBuffer("Dog");
        //1 append() - добавляет строку в конец
        sb.append(" runs");
        System.out.println("StringBuilder after append: " + sb);
        //2 insert() - вставляет строку в указанную позицию
        sb.insert(4, "fast ");
        System.out.println("StringBuilder after insert: " + sb);
        //3 replace() - заменяет часть строки на другую строку
        sb.replace(4, 9, "slow");
        System.out.println("StringBuilder after replace: " + sb);
        //4 delete() - удаляет символы между указанными индексами
        sb.delete(4, 9);
        System.out.println("StringBuilder after delete: " + sb);
        //5 reverse() - переворачивает строку
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb);
      
        //Методы StringBuffer
        //6 capacity() - возвращает текущую емкость буфера
        System.out.println("StringBuffer capacity: " + sf.capacity());
        //7 ensureCapacity() - увеличивает емкость, если необходимо
        sf.ensureCapacity(50);
        System.out.println("StringBuffer after ensureCapacity: " + sf.capacity());
        //8 charAt() - возвращает символ по индексу
        char ch = sf.charAt(1);
        System.out.println("StringBuffer charAt(1): " + ch);
        //9 setCharAt() - изменяет символ в указанной позиции
        sf.setCharAt(1, 'a');
        System.out.println("StringBuffer after setCharAt: " + sf);
        //10 substring() - возвращает подстроку
        String sub = sf.substring(1, 3);
        System.out.println("StringBuffer substring(1, 3): " + sub);
    }
}

/*
StringBuilder after append: Cat runs
StringBuilder after insert: Cat fast runs
StringBuilder after replace: Cat slowruns
StringBuilder after delete: Cat uns
StringBuilder after reverse: snu taC

StringBuffer capacity: 19
StringBuffer after ensureCapacity: 50
StringBuffer charAt(1): o
StringBuffer after setCharAt: Dag
StringBuffer substring(1, 3): ag
*/
