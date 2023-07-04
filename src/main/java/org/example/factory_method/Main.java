package org.example.factory_method;


import static org.example.factory_method.NotificationService.CreateNotifier;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(CreateNotifier("SMS"));
        notificationService.SendNotification("Hello world!");
    }
}