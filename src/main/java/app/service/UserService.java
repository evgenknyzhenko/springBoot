package app.service;

import app.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getByEmail(String email);
}
