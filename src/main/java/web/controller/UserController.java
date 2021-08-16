package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
<<<<<<< HEAD
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        return "user/addUser";
=======
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/admin")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        return "admin/addUser";
>>>>>>> a16408d (Complete)
    }

    @GetMapping("/edit/{id}")
    public String editUser(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", userService.getUser(id));
<<<<<<< HEAD
        return "user/editUser";
=======
        return "admin/editUser";
>>>>>>> a16408d (Complete)
    }

    @PatchMapping("/edit/{id}")
    public String updateUser(@ModelAttribute("user") User user,
                             @PathVariable("id") Long id) {
        userService.updateUser(user, id);
<<<<<<< HEAD
        return "redirect:/";
=======
        return "redirect:/admin";
>>>>>>> a16408d (Complete)
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());

        userService.addUser(user);
<<<<<<< HEAD
        return "redirect:/";
=======
        return "redirect:/admin";
>>>>>>> a16408d (Complete)
    }

    @GetMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
<<<<<<< HEAD
        return "redirect:/";
=======
        return "redirect:/admin";
>>>>>>> a16408d (Complete)
    }
}
