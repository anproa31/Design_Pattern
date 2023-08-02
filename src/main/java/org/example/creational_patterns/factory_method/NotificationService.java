package org.example.creational_patterns.factory_method;

import org.example.creational_patterns.base.message.Email;
import org.example.creational_patterns.base.message.Notifier;
import org.example.creational_patterns.base.message.SMS;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void SendNotification(String message) {
        notifier.Send(message);
    }

    public static Notifier CreateNotifier(String notifierType) {
        if (notifierType == "SMS") {
            return new SMS();
        }
        return new Email();
    }
}