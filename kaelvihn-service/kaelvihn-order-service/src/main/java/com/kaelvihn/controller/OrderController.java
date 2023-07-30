package com.kaelvihn.controller;

import com.order.pojo.Order;
import com.kaelvihn.service.OrderService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 1:48
 */

@RestController
@RequestMapping("/kaelvihn/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/{id}")
    public List<Order> getByUserId(@PathVariable Long id) {
        return orderService.listOrderByUserId(id);
    }
}
