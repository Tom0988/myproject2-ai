package com.tom.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("Normal", "001", 1200);
        Customer c2 = new Customer("Normal", "002", 800);
        SilverCustomer c3 = new SilverCustomer("Silver", "003", 2000);
        Customer c4 = new Customer("Normal", "004", 1500);
        GoldCustomer c5 = new GoldCustomer("Gold", "005", 1500);
        PlatinumCustomer c6 = new PlatinumCustomer("Platinum", "006", 2000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        c6.print();
    }
}
