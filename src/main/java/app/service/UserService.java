package app.service;

import app.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<List<User>> getAll();

    User getByEmail(String email);

    User addUser(User user);
}
