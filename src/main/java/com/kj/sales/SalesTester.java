package com.kj.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("lv0", "001", 1200));
        customers.add(new Customer("lv0", "002", 800));
        customers.add(new SilverCustomer("lv1", "003", 2000));
        customers.add(new Customer("lv1", "004", 1500));
        customers.add(new GoldCustomer("lv2", "005", 1500));
        customers.add(new PlatinumCustomer("lv3", "006", 2000));

        System.out.println("The test for print customers by for loop: ");
        for (int i = 0; i < 6; i++){
            customers.get(i).print();
        }

        System.out.println("The test for print customers by for each loop: ");
        for (Customer c : customers){
            c.print();
        }
    }
}
