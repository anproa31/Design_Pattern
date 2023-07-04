package org.example.strategy;

import org.example.base.message.Email;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new Email());
        notificationService.SendNotification("Hi there!");
    }
}