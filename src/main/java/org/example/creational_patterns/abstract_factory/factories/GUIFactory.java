package org.example.creational_patterns.abstract_factory.factories;

import org.example.creational_patterns.abstract_factory.buttons.Button;
import org.example.creational_patterns.abstract_factory.checkboxes.Checkbox;


public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
