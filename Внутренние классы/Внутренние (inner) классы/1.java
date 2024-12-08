/*
Публичный внутренний класс (PublicInner) - доступен отовсюду
Приватный внутренний класс (PrivateInner) - доступен только внутри ClassA
Защищённый внутренний класс (ProtectedInner) - доступен внутри пакета и наследникам
Класс с пакетным доступом (SimpInner) - доступен только внутри пакета
*/

public class ClassA {

    public class PublicInner {

        public void display() {
            System.out.println("Public inner class");
        }
    }

    private class PrivateInner {

        public void display() {
            System.out.println("Private inner class");
        }
    }

    protected class ProtectedInner {

        public void display() {
            System.out.println("Protected inner class");
        }
    }

    class SimpInner {

        public void display() {
            System.out.println("simple inner class");
        }
    }

    public void accessPrivateInner() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();
    }
}

class Main {

    public static void main(String[] args) {

        ClassA.PublicInner publicInner = new ClassA().new PublicInner();
        publicInner.display();

        ClassA.ProtectedInner protectedInner = new ClassA().new ProtectedInner();
        protectedInner.display();

        ClassA.SimpInner packagePrivateInner = new ClassA().new SimpInner();
        packagePrivateInner.display();

        new ClassA().accessPrivateInner();
    }
}
