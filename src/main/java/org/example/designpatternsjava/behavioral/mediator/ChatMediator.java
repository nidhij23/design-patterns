package org.example.designpatternsjava.behavioral.mediator;


public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
