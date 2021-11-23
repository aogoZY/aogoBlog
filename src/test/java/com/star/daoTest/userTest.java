package com.star.daoTest;

import com.star.dao.UserDao;
import com.star.entity.User;
import com.star.myBlogApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = myBlogApplication.class)
public class userTest {
    @Autowired
    UserDao userDao;

    @Test
    public void logintTest() {
        User user = userDao.findByUserNameAndPassword("aogo", "202cb962ac59075b964b07152d234b70");
        System.out.println(user);
    }
}
