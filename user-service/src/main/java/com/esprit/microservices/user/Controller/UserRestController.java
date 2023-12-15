package com.esprit.microservices.user.Controller;

import com.esprit.microservices.user.Entity.User;
import com.esprit.microservices.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/User")
public class UserRestController {

    @Autowired
    UserService userService;



    @PostMapping("/add-User")
    @ResponseBody
    public User addUser(@RequestBody User u)
    {
        return userService.addUser(u);

    }
    @GetMapping
    public List<User> getUser() {
        return userService.getUser();
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
