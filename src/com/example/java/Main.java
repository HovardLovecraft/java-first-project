package com.example.java;

import com.classes.people.Customer;
import com.classes.tools.CustomerGenerator;
import com.classes.people.CustomerList;
import com.classes.tools.Sorter;
import com.google.gson.Gson;

import java.util.*;


public class Main {

    public static void main (String [] args) {

        Gson gson = new Gson();
        Customer[] customers = CustomerGenerator.generateCustomersArrayWithIDs();
        customers[0].setFirstName("").setLastName("");
        CustomerList list = new CustomerList();


        list.addCustomer( "Ivan", "Kuznetsov", "Kyiv",        1234123412341234L, "IBAN0001");
        list.addCustomer( "Ira", "Kuznetsova", "Kyiv",        6789987656462323L, "IBAN0002");
        list.addCustomer( "Victor", "Rosta", "Moscow",        4444222211116666L, "IBAN0003");
        list.addCustomer( "Peter", "Marek", "Warsaw",         9999888877776666L, "IBAN0004");
        list.addCustomer( "Nicholas", "Barker", "Oslo",       9876543212345678L, "IBAN0004");
        list.addCustomer( "Jurgen", "Klinsman", "Munich",     1234567898765432L, "IBAN0006");
        list.addCustomer( "John", "Doe", "Unknown",           6543654334563456L, "IBAN0007");
        list.addCustomer( "Brad", "Pitt", "Los Angeles",      7654765434563456L, "IBAN0008");
        list.addCustomer( "Sub", "Zero", "Tokyo",             2223334444555566L, "IBAN0009");
        list.addCustomer( "Chris", "Redfield", "Racoon City", 2221130987654321L, "IBAN0010");

        String customersJson = gson.toJson(list.getList());
        System.out.println(customersJson);

        System.out.println(list.getList());

//        System.out.println("Customer Name Sorting");
//        List<Customer> sortedList = list.getSortedList(Sorter.customerNameComparator);

        System.out.println("Ranged list by credit card number");
        List<Customer> rangedList = list.getCustomersByCreditCardRange(4000000000000000L, 8000000000000000L);
        System.out.println(rangedList);



//        for (Customer str : sortedList){
//            System.out.println(str);
//        }


//        System.out.println(Sorter.getReversedString("ivan".toCharArray()));
        Sorter.printMatrix();
    }
}
