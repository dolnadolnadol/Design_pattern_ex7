public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);
        Employee em2 = new Employee("Kamphaka", "Head Sales", 300000);
        Employee em3 = new Employee("UngInk", "Head Marketing", 300000);
        ceo.subordinates.add(em2);
        ceo.subordinates.add(em3);
        em2.subordinates.add(new Employee("Wiroj", "Sales", 150000));
        em2.subordinates.add(new Employee("Weeranan", "Sales", 100000));
        em3.subordinates.add(new Employee("Oak", "Marketing", 200000));
        em3.subordinates.add(new Employee("Aem", "Marketing", 250000));
        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
        for (Employee subordinate : ceo.subordinates) {
            System.out.println("\t" + subordinate);
            for (Employee subSubordinate : subordinate.subordinates) {
                System.out.println("\t\t" + subSubordinate);
            }
        }
    }
    
    
}
