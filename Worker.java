package inheritance;

public class Worker extends Employee{
    private String name;
    private String surname;
    private int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Worker(String name, String surname) {
        this(name, surname, 0);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getSalary() {
        return salary;
    }

    public void shout() {
        System.out.println("Więcej pracy. Więcej!!!!!!!!! ......... żart");
    }
}
