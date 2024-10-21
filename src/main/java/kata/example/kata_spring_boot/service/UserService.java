package kata.example.kata_spring_boot.service;

import kata.example.kata_spring_boot.entity.User;;

import java.util.List;

public interface UserService {

    public List<User> getUsers();
    public void addUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(int id);
}