package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.base.restaurant.Cake;
import org.example.creational_patterns.base.restaurant.Coffee;
import org.example.creational_patterns.base.restaurant.Drink;
import org.example.creational_patterns.base.restaurant.Food;

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
