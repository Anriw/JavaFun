package inheritance;

public class Main {
    public static void main(String[] args){

        Worker oskar = new Worker("Oskar" , "Polak");
        System.out.println(oskar.getName());
        oskar.shout();

        Manager manager = new Manager("Adam", "Nawalka", 2000, -500);
        System.out.println(manager.getExtraSalary());
        System.out.println(manager.getTotalSalary());
        manager.shout();

        Worker tomek = new Manager("Tomek", "Jakiśtam");
        //robi to samo co niżej printMenu ale ręcznie (nie ma sensu)

        Boss bossPeter = new Boss("Piotr", "Pyjas" , "Audi");

        bossPeter.kickOut(manager);
        bossPeter.kickOut(oskar);
        bossPeter.kickOut(tomek);

        bossPeter.shout();

        printMenu(oskar);
        printMenu(manager);//autokonwersja
        printMenu(tomek);

        IManagement[] iManagement = new IManagement[4];
        iManagement[0] = bossPeter;
        iManagement[1] = manager;

    }

    public static void printMenu(Worker worker){ //autokonwersja menagaera na workera
        System.out.println(worker.getName() + " " + worker.getSurname());
    }
}
