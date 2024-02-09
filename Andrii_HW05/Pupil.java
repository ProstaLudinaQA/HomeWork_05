package Andrii_HW05;

public class Pupil extends Person {


    private String schoolClass;

    public Pupil(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Pupil(int age, String fullName, String schoolClass) {
        super(age, fullName);
        this.schoolClass = schoolClass;
    }



    public void setClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void move() {
        super.move();
    }
    public void study() {
        String fullName = new String (getFullName ());
        System.out.println("Учень  "    +fullName +  "  навчається в класі "  + schoolClass);
}

}







