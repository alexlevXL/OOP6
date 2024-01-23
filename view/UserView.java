package view;

import java.util.List;

import data.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list); 

}
