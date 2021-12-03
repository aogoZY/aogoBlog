package com.star.service.Impl;

import com.star.dao.FriendDao;
import com.star.entity.Friend;
import com.star.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    FriendDao friendDao;

    public List<Friend> queryAllFriend() {
        return friendDao.getAllFriendList();
    }

    //    根据id查询友链
    public Friend queryFriendById(long id) {
        return friendDao.getFriendById(id);
    }

    //    根据名称查询友链
    public Friend queryFriendByName(String name) {
        return friendDao.getFriendByName(name);
    }

    //    更新friend
    public int updateFriend(Friend friend) {
        return friendDao.updateFriend(friend);
    }

    //    删除友链
    public int deleteFriend(Long id) {
        return friendDao.delete(id);
    }

    public int saveFriend(Friend friend) {
        return friendDao.saveFriend(friend);
    }

}
