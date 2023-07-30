package com.feign.kaelvihn.order;

import com.order.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/31 2:56
 */

/**
 * value 为实现该接口服务名
 * path 相当于controller上的RequestMapper
 */
@FeignClient(value = "order-service",path = "/kaelvihn/order")
public interface OrderFeign {
    @GetMapping("/{id}")
    List<Order> getByUserId(@PathVariable Long id);
}
