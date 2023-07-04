package org.example.factory_method;

import org.example.base.message.Email;
import org.example.base.message.Notifier;
import org.example.base.message.SMS;

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
