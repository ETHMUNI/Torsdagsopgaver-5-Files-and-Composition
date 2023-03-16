package Task1;

import Task1.Customer;

import java.util.ArrayList;

public class Main {

    public static void printCustomers() {
        for(Customer c: customers) {
            System.out.println(c);
        }
    }
    static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {

        customers.add(new Customer("A", "AA", "AAA"));
        customers.add(new Customer("B", "BB", "BBB"));
        customers.add(new Customer("C", "CC", "CCC"));
        customers.add(new Customer("D", "DD", "DDD"));
        customers.add(new Customer("E", "EE", "EEE"));
        customers.add(new Customer("F", "FF", "FFF"));

        printCustomers();
    }
}