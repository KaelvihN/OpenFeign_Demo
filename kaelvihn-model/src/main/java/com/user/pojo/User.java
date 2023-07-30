package com.user.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author : KaelvihN
 * @date : 2023/7/29 17:10
 */
@Data
@Alias("User")
public class User {
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 地址
     */
    private String address;
}
