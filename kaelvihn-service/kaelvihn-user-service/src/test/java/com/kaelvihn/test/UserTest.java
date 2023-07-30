package com.kaelvihn.test;


import com.kaelvihn.dao.UserDao;
import com.user.pojo.User;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




/**
 * @author : KaelvihN
 * @date : 2023/7/30 15:48
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Resource
    private UserDao userDao;

    @Test
    public void test1() {
        User user = userDao.getById(1L);
        System.out.println("user = " + user);
    }


}
