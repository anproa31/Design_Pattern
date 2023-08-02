package org.example.behavioral_patterns.strategy;

import org.example.creational_patterns.base.message.Email;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new Email());
        notificationService.SendNotification("Hi there!");
    }
}