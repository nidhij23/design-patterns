package org.example.designpatternsjava.structural.bridge;

public class UrgentNotification extends Notification{
    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("URGENT:"+message);
    }
}
