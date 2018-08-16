package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
    public User getByEmail(@PathVariable String email) {

        return userService.getByEmail(email);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }


}
