package org.example.strategy;

import org.example.base.message.Notifier;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void SendNotification(String message) {
        notifier.Send(message);
    }
}
