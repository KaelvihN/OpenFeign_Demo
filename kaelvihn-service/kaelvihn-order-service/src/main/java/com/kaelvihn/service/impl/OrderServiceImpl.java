package com.kaelvihn.service.impl;

import com.kaelvihn.dao.OrderDao;
import com.order.pojo.Order;
import com.kaelvihn.service.OrderService;
import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 1:47
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Override
    public List<Order> listOrderByUserId(Long id) {
        return orderDao.listOrderByUserId(id);
    }
}
