package com.kj.sales;

public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer(String level, String id, int amount) {super(level, id, amount);}

    @Override
    public int getReturnMoney() {
        return (int)(amount * 0.2f);
    }

    @Override
    public float getOffMoney() {
        return this.amount * 0.3f;
    }
}
