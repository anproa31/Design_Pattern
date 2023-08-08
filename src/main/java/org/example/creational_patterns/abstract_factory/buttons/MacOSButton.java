package org.example.creational_patterns.abstract_factory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
