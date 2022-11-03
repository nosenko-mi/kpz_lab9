package com.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{

    private List<User> users;

    public ChatMediator(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
