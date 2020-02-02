public class Main {
    public static void main(String[] args) {
        System.out.println("TEST Main Class");

//      Add bank
        Bank bank = new Bank("National Bank");

//      Add Branch
        bank.addBranch("Philadelphia");
        bank.addBranch("New York City");

//      Add Customer
        bank.addCustomer("Philadelphia", "Tim", 100.22);
        bank.addCustomer("Philadelphia", "Jane", 44.09);
        bank.addCustomer("Philadelphia", "Steve", 500);
        bank.addCustomer("New York City", "Bob", 250.99);

        bank.addCustomerTransaction("Philadelphia", "Tim", 1500.44);
        bank.addCustomerTransaction("Philadelphia", "Tim", -34.22);
        bank.addCustomerTransaction("Philadelphia", "Jane", 725.24);
        bank.addCustomerTransaction("New York City", "Bob", 377.32);

//      List customers
        bank.listCustomers("Philadelphia", true);
        bank.listCustomers("New York City", false);

    }
}
