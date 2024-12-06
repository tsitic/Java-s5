class Person {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi! I am " + firstName + " " + lastName + ".");
    }

    public void checkDrivingEligibility() {
        if (canDrive()) {
            System.out.println("I am eligible to drive.");
        } else {
            System.out.println("I am not eligible to drive.");
        }
    }

    protected String firstName;
    protected String lastName;
    protected int age;

    protected boolean canDrive() {
        return age >= 16;
    }
}

class Worker extends Person {
    public Worker(String firstName, String lastName, int age, String profession) {
        super(firstName, lastName, age);
        this.profession = profession;
    }

    public void showProfession() {
        System.out.println(firstName + " works as a " + profession + ".");
    }

    private String profession;
}

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("John", "Doe", 25, "Engineer");
        worker.introduce();
        worker.checkDrivingEligibility();
        worker.showProfession();
    }
}

