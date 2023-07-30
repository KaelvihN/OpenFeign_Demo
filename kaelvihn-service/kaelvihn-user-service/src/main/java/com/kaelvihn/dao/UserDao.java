package com.kaelvihn.dao;

import com.user.dto.UserQuery;
import com.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : KaelvihN
 * @date : 2023/7/30 4:38
 */

@Mapper

public interface UserDao {

    @Select("select * from tb_user")
    List<User> listUser();

    List<User> listUserByName(UserQuery userQuery);

    @Select("select * from tb_user where id = #{id}")
    User getById(Long id);
}
