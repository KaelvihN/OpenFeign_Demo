package com.kaelvihn.service;

import com.github.pagehelper.PageInfo;
import com.order.pojo.Order;
import com.user.dto.UserQuery;
import com.user.pojo.User;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 4:39
 */
public interface UserService {
    List<User> listUser();

    PageInfo<User> listUserByName(UserQuery userQuery);

    User getById(Long id);

    List<Order> orderList(User user);
}
