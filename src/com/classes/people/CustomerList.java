package com.classes.people;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerList {

    private List<Customer> list = new ArrayList<>();

    public void addCustomer(String firstName, String lastName, String address, long creditCardNumber, String bankAccount) {
        int id = list.size() + 1;
        Customer customer = new Customer(id, firstName, lastName, address, creditCardNumber, bankAccount);
        list.add(customer);
    }

    public List<Customer> getList() {
        return new ArrayList<>(list);
    }

    public List<Customer> getSortedList(Comparator<Customer> comparator) {
        List<Customer> result = this.getList();
        result.sort(comparator);
        return result;
    }

    public List<Customer> getCustomersByCreditCardRange(long from, long to) {
        return list.stream()
                .filter(customer -> customer.getCreditCardNumber() > from && customer.getCreditCardNumber() < to)
                .collect(Collectors.toList());
//        List<Customer> result = new ArrayList<>();
//        for (Customer customer : list) {
//            if(customer.getCreditCardNumber() > from && customer.getCreditCardNumber() < to){
//                result.add(customer);
//            }
//        }
//        return result;
    }
}
