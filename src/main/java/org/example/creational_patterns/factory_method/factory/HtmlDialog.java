package org.example.creational_patterns.factory_method.factory;

import org.example.creational_patterns.factory_method.buttons.Button;
import org.example.creational_patterns.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
