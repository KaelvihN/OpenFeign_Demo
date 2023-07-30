package com.kaelvihn.service;



import com.order.pojo.Order;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 1:47
 */
public interface OrderService {
    List<Order> listOrderByUserId(Long id);

}
