/*
Внутренний класс имеет доступ ко всем полям и методам внешнего класса, включая приватные. Это связано с тем, что внутренний класс является членом внешнего класса 
и видит его содержимое, независимо от спецификаторов доступа
*/

public class classA {

    private String privateField = "Private Field";
    public String publicField = "Public Field";

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void SimpMethod() {
        System.out.println("Simple Method");
    }

    // Внутренний класс
    public class InnerClass {

        public void whatinA() {
            // Доступ к полям внешнего класса
            System.out.println(privateField);
            System.out.println(publicField);
            // Доступ к методам внешнего класса
            protectedMethod();
            SimpMethod();
        }
    }
}

class Main {
    public static void main(String[] args) {
        classA outer = new classA();
        classA.InnerClass inner = outer.new InnerClass();

        inner.whatinA();
    }
}
