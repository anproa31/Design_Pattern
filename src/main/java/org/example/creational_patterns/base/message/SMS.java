package org.example.creational_patterns.base.message;

public class SMS implements Notifier {
    public void Send(String message) {
        System.out.println("SMS: " + message);
    }
}
