package com.star.dao;

import com.star.entity.Friend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FriendDao {
    //    查询所有友链
    List<Friend> getAllFriendList();

    //    新增友链
    int saveFriend(Friend friend);

    //    更新友链
    int updateFriend(Friend friend);

    //    删除友链
    int delete(long id);

    //    根据名称查询友链
    Friend getFriendByName(String name);

    //    根据id查询友链
    Friend getFriendById(long id);
}
