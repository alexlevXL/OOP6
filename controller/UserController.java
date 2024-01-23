package controller;

import data.User;

public interface UserController <T extends User> {
    void create (String firsName, String secondName, String lastName);
    
    void sendOnConsole();
}
