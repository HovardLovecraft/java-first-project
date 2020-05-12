package com.classes.tools;

import com.classes.people.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerGenerator {

    public static Customer[] generateCustomersArrayWithIDs() {
        Customer[] customers = new Customer[10];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(i+1);
        }
        return customers;
    }

    public static List<Customer> generateArrayListOfCustomers(Customer[] customers) {
//        List<Customer> customerList = new ArrayList<>();
//        for (int i = 0; i < customers.length; i++) {
//            customerList.add(customers[i]);
//        }
//        return customerList;
       return Arrays.asList(customers);

    }
}
