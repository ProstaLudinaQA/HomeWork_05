package Andrii_HW05;

import java.util.Objects;

public class Person {
    protected int ageClass;
    private int age;
private String fullName;


    public Person(int age , String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
    public Person() {

    }



    public int getAge() {
        return age;
    }


    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public void move() {
        System.out.println(fullName + " ходить");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fullName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';




}

}


