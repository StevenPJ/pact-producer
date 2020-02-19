package com.stevenpj.pactproducer;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public User getUser(@PathVariable String userId) {
        return userService.findUser(userId);
    }

}
