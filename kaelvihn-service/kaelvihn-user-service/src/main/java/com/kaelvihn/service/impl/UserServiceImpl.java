package com.kaelvihn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaelvihn.dao.UserDao;

import com.feign.kaelvihn.order.OrderFeign;
import com.kaelvihn.service.UserService;
import com.order.pojo.Order;
import com.user.dto.UserQuery;
import com.user.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 4:39
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    public PageInfo<User> listUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(), userQuery.getPageSize());
        return new PageInfo<User>(userDao.listUserByName(userQuery));
    }

    @Override
    public User getById(Long id) {
        User user = userDao.getById(id);
        return user;
    }

    @Autowired
    private OrderFeign orderFeign;

    @Override
    public List<Order> orderList(User user) {
        Long id = user.getId();
        List<Order> orderList = orderFeign.getByUserId(id);
        return orderList;
    }
}
