package Andrii_HW05;

public class Worker extends Employee {
    private final String  speciality;
    public Worker(String fullName, int age, String speciality) {
        super(fullName, age);
        this.speciality = speciality;
    }
    @Override
    public void move () {
        System.out.println("Такий" + "ходить");
    }




    @Override
    public void talk() {
        System.out.println("Такий Worker говорить");
    }

    public void hasSpeciality() {
        System.out.println("Такий Worker має спеціальність: " + speciality);
    }




}


