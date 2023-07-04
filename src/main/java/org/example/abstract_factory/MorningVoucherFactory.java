package org.example.abstract_factory;

import org.example.base.restaurant.Cake;
import org.example.base.restaurant.Coffee;
import org.example.base.restaurant.Drink;
import org.example.base.restaurant.Food;

public class MorningVoucherFactory implements VoucherAbstractFactory {
    public Food GetFood() {
        return new Cake();
    }

    public Drink GetDrink() {
        return new Coffee();
    }

    @Override
    public String GetMessage() {
        return "Morning voucher";
    }
}
