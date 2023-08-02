package org.example.behavioral_patterns.strategy;

import org.example.creational_patterns.base.message.Notifier;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void SendNotification(String message) {
        notifier.Send(message);
    }
}
