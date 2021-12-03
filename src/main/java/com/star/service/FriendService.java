package com.star.service;

import com.star.entity.Friend;

import java.util.List;

public interface FriendService {
    //    查询所有友链
    List<Friend> queryAllFriend();

    //    根据id查询友链
    Friend queryFriendById(long id);

    //    根据名称查询友链
    Friend queryFriendByName(String name);

    //    更新friend
    int updateFriend(Friend friend);

    //    删除友链
    int deleteFriend(Long id);

    //    保存friend
    int saveFriend(Friend friend);


}
