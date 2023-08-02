package org.example.creational_patterns.abstract_factory;


import org.example.creational_patterns.base.restaurant.Drink;
import org.example.creational_patterns.base.restaurant.Food;

public interface VoucherAbstractFactory {
    public Food GetFood() ;
    public Drink GetDrink() ;
    public String GetMessage();
}
