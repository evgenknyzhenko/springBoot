package app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @RequestMapping(value = "/admin/hello", method = RequestMethod.GET)
    public String helloAdmin() {
        return "hello admin";
    }
}
