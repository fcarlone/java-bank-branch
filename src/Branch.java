import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

//  Constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

//  Getter
    public String getName() {
        return name;
    }

//  Create new customer and initial transaction
    public boolean newCustomer(String customerName, double initialDeposit) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialDeposit));
            return true;
        }
        return false;
    }

//  Transactions
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

//  Query customer
    private Customer findCustomer(String customerName) {
        for(int i = 0; i < this.customers.size(); i++) {
//            if(this.customers.get(i).getName().equals(customerName)){
//                return this.customers.get(i);
//            }

            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
