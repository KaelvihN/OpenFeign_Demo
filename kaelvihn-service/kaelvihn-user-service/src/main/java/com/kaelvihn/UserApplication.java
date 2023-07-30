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

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = OrderFeign.class)
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
