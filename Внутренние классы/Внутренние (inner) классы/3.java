/*
Внешний класс имеет доступ к полям и методам внутреннего класса, только если у него есть к ним доступ согласно спецификаторам доступа внутреннего класса
*/

 public class ClassA {

    public class PublicInner {

        public String publicField = "Public Field";
        private String privateField = "Private Field";

        public void displayPublic() {
            System.out.println("PublicInner: Public Method");
        }

        private void displayPrivate() {
            System.out.println("PublicInner: Private Method");
        }
    }

    private class PrivateInner {

        public String publicField = "PrivateInner Public Field";

        public void display() {
            System.out.println("PrivateInner: Public Method");
        }
    }

    protected class ProtectedInner {

        public String protectedField = "Protected Field";

        public void display() {
            System.out.println("ProtectedInner: Protected Method");
        }
    }

    class SimpInner {

        public String simpleField = "Simple Field";

        public void display() {
            System.out.println("SimpInner: Simple Method");
        }
    }

    public void accessInnerClasses() {
        // Доступ к PublicInner
        PublicInner publicInner = new PublicInner();
        System.out.println(publicInner.publicField); 
        publicInner.displayPublic();
        // Доступ к приватному полю и методу (возможно внутри внешнего класса)
        System.out.println(publicInner.privateField);
        publicInner.displayPrivate();

        // Доступ к PrivateInner (возможно только в этом классе)
        PrivateInner privateInner = new PrivateInner();
        System.out.println(privateInner.publicField);
        privateInner.display();

        // Доступ к ProtectedInner
        ProtectedInner protectedInner = new ProtectedInner();
        System.out.println(protectedInner.protectedField);
        protectedInner.display();

        // Доступ к SimpInner
        SimpInner simpInner = new SimpInner();
        System.out.println(simpInner.simpleField);
        simpInner.display();
    }
}

class Main {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.accessInnerClasses();
    }
}
