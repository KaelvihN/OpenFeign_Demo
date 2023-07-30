package com.user.dto;

import lombok.Data;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 4:37
 */

@Data
public class UserQuery {
    private Integer pageNum = 1;
    private Integer pageSize = 2;
    private String name;
}
