package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.base.restaurant.Beer;
import org.example.creational_patterns.base.restaurant.Drink;
import org.example.creational_patterns.base.restaurant.Food;
import org.example.creational_patterns.base.restaurant.GrilledMeat;

public class EveningVoucherFactory implements VoucherAbstractFactory {
    public Food GetFood() {
        return new GrilledMeat();
    }

    public Drink GetDrink() {
        return new Beer();
    }

    @Override
    public String GetMessage() {
        return "Evening voucher";
    }
}
