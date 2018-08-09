package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
    public User getByEmail(@PathVariable String email) {

        return userService.getByEmail(email);
    }

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }
}
