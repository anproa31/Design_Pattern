package org.example.creational_patterns.factory_method;


public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(NotificationService.CreateNotifier("SMS"));
        notificationService.SendNotification("Hello world!");
    }
}