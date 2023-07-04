package org.example.abstract_factory;

import org.example.base.restaurant.Beer;
import org.example.base.restaurant.Drink;
import org.example.base.restaurant.Food;
import org.example.base.restaurant.GrilledMeat;

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
