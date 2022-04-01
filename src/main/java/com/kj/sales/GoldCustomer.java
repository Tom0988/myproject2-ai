package com.kj.sales;

public class GoldCustomer extends SilverCustomer{
    public GoldCustomer (String level, String id, int amount){ super(level, id, amount); }

    @Override
    public float getOffMoney() {
        return amount * off;
    }
}
