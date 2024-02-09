package Andrii_HW05;



public abstract class Employee  {
    private String fullName;
    private int age;



public Employee(String fullName, int age) {
    this.fullName = "";
    this.age = 0;
}
    @Override
    public String toString() {
        return "Employee{fullName='" + fullName + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (age != employee.age) return false;
        return fullName != null ? fullName.equals(employee.fullName) : employee.fullName == null;
    }

    public abstract void move();

    public abstract void talk();
}








