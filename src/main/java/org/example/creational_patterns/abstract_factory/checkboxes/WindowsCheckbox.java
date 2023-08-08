package org.example.creational_patterns.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
