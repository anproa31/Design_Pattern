package org.example.base.message;

import org.example.base.message.Notifier;

public class SMS implements Notifier {
    public void Send(String message) {
        System.out.println("SMS: " + message);
    }
}
