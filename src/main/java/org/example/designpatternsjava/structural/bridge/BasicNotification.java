package org.example.designpatternsjava.structural.bridge;

public class BasicNotification extends  Notification{

    public BasicNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send(message);
    }
}
