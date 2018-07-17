package inheritance;

public class Manager extends Worker implements IManagement{
    private int extraSalary;

    public Manager(String name, String surnanme, int salary, int extraSalary) {
        super(name, surnanme, salary);
        this.extraSalary = extraSalary;
    }

    public Manager(String name, String surname) {

        super(name, surname);
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void getExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    public int getTotalSalary() {
//        this.totalSalary = getExtraSalary() + getSalary();
        return getSalary() + extraSalary;
    }

    @Override
    public void shout() {
        System.out.println("Get back to work maggots!!!!!!!!13tb141354151");
    }

    @Override
    public void kickOut(Worker worker) {
        System.out.println("Pojde zapytac bossa czy moge, wiec luz");
    }

    @Override
    public void sellCompany() {
        System.out.println("jestem za, ale chce 20% udzialow");

    }
}
