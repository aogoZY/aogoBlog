package com.star.daoTest;

import com.star.dao.FriendDao;
import com.star.entity.Friend;
import com.star.myBlogApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = myBlogApplication.class)
public class friendTest {
    @Autowired
    FriendDao friendDao;

    @Test
    public void testAllFriend() {
        List<Friend> friends = friendDao.getAllFriendList();
        System.out.println(friends);
    }

    @Test
    public void testAddFriend() {
        Friend friend = new Friend();
        Date timeNow = new Date();
        friend.setBlogname("friend link 1");
        friend.setBlogaddress("https://www.cnblogs.com/diffx/p/10611082.html");
        friend.setCreateTime(timeNow);
        friend.setPictureaddress("picture address 1");
        int affected = friendDao.saveFriend(friend);
        if (affected > 0) {
            System.out.println("add friend success");

        } else {
            System.out.println("add friend fail");
        }
    }

    @Test
    public void testUpdateFriend() {
        Friend friend = new Friend();
        friend.setId(58l);
        friend.setBlogname("new name");
        friend.setPictureaddress("new picture");
        friend.setBlogaddress("new address");
        int affected = friendDao.updateFriend(friend);
        if (affected > 0) {
            System.out.println("update friend success");
        } else {
            System.out.println("update friend failed");
        }
    }
}
