package com.kaelvihn.controller;

import com.kaelvihn.service.UserService;
import com.order.pojo.Order;
import com.user.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 5:10
 */

@RestController
@RequestMapping("/kaelvihn/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/orderList")
    public List<Order> orderList(@RequestBody User user) {
        return userService.orderList(user);
    }
}
