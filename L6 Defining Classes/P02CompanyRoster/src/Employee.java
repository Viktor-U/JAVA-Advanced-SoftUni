public class Employee {

    private String name;
    private double salary;
    private String department;
    private String email = "n/a";
    private String age = "-1";


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %s", this.name, this.salary ,this.email, this.age);
    }


}
