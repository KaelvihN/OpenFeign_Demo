package com.kaelvihn.dao;

import com.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 1:44
 */

@Repository //将OrderMapper交给spring ioc管理
@Mapper     //告诉springboot 这是一个mybatis的 mapper类
public interface OrderDao {

    @Select("select * from tb_order where user_id = #{id}")
    List<Order> listOrderByUserId(Long id);
}
