package org.example.factory_method;

import org.example.base.Email;
import org.example.base.Notifier;
import org.example.base.SMS;

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
