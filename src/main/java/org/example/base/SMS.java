package org.example.base;

public class SMS implements Notifier {
    public void Send(String message) {
        System.out.println("SMS: " + message);
    }
}
