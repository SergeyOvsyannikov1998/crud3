package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String welcome(ModelMap model) {
        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);
        return "main/index";
    }
}
