package com.kj.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String level, String id, int amount) {super(level, id, amount);}
    public int getReturnMoney() {
        return (int)(amount*0.1f);
    }

    @Override
    public void print() {
        System.out.println(level + "\t" + id + "\t" + amount + "\t" + (amount-getOffMoney())+"("+getReturnMoney()+")");
    }
}
