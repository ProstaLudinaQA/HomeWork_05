package Andrii_HW05;

public class Main {


    public static void main(String[] args) {
        
        Person myPerson = new Person(12, "Andrii");
        Person myPerson1 = myPerson;
        myPerson1.talk();
        myPerson1.move();

        Person personfuulNameage = new Person(18, "Sergii");
        Person personfuulNameage2 = new Person(12,  "Andrii");
        Person personfuulNameage3 = new Person();
        personfuulNameage3.setAge(12);
        personfuulNameage3.setFullName("Andrii");
        Person personpersonfuulNameage = personfuulNameage;
        personfuulNameage.move();
        personfuulNameage.talk();

        System.out.println("\nПеревірка рівності:");
        System.out.println(personfuulNameage2.equals(personfuulNameage3));
        System.out.println(personfuulNameage.equals(personfuulNameage3));

        Pupil pupil1 = new Pupil(12, "Victoria","10-F");
        Pupil pupil2 = new Pupil(12, "Vova", "6А" );

        pupil1.move();
        pupil1.talk();
        pupil1.study();

        pupil2.move();
        pupil2.talk();
        pupil2.study();

        Worker worker1 = new Worker("Іван Петров", 30, "будівельник");
        Worker worker2 = new Worker("Марина Сидорова", 25, "електрик");

        worker1.move();
        worker1.talk();
        worker1.hasSpeciality();

        worker2.move();
        worker2.talk();
        worker2.hasSpeciality();













    }

}
