package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.abstract_factory.buttons.Button;
import org.example.creational_patterns.abstract_factory.checkboxes.Checkbox;
import org.example.creational_patterns.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
