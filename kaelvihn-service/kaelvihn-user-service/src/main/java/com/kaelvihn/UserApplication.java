package com.kaelvihn;

import com.feign.kaelvihn.order.OrderFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 6:42
 */

/**
 * EnableDiscoveryClient 开启注册服务
 * EnableFeignClients(clients = OrderFeign.class) 开启openfeign调用
 * 和扫描OrderFeign类 将OrderFeign加入到spring ioc中
 * 除此之外 还可以使用
 * @EnableFeignClients(basePackages = "com.feign.kaelvihn.order") 对整个包进行扫描
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = OrderFeign.class,basePackages = "com.feign.kaelvihn.order")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
