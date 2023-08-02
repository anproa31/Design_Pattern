package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.base.restaurant.Drink;
import org.example.creational_patterns.base.restaurant.Food;

public class GetVoucher {
    private final Drink drink;
    private final Food food;
    private final String message;

    public GetVoucher(VoucherAbstractFactory factory) {
        drink = factory.GetDrink();
        food = factory.GetFood();
        message = factory.GetMessage();
    }

    public void ShowVoucher() {
        drink.Drink();
        food.Eat();
        System.out.println(message);
    }
}
