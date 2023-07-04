package org.example.abstract_factory;

import org.example.base.restaurant.Drink;
import org.example.base.restaurant.Food;

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
