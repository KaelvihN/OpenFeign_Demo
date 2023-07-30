package com.order.pojo;

import com.user.pojo.User;
import lombok.Data;

/**
 * @author : KaelvihN
 * @date : 2023/7/29 17:13
 */

@Data
public class Order {
    /**
     * 主键
     */
    private Long id;
    /**
     * 价格
     */
    private Long price;
    /**
     * 名字
     */
    private String name;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户
     */
    private User user;
}
