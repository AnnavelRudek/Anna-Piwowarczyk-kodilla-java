package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String name) throws MessageNotSentException{
        if(user != null){
        System.out.println("Sending message: " + "to" + user.getName());
    }
    throw new MessageNotSentException("Object User was null");
}
}
