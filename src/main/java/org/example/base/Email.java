package org.example.base;

public class Email implements Notifier {
    public void Send(String message) {
        System.out.println("Email: " + message);
    }

}
