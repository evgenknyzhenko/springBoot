package app.controller;

import app.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping
    public User testUser() {
        User user = new User();
        user.setId(1L);
        user.setEmail("emal");
        user.setPassword("123a");
        user.setFirstName("aa");
        user.setLastName("aaa");
        return user;
    }
}
