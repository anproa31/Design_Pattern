package org.example.abstract_factory;


import org.example.base.restaurant.Drink;
import org.example.base.restaurant.Food;

public interface VoucherAbstractFactory {
    public Food GetFood() ;
    public Drink GetDrink() ;
    public String GetMessage();
}
