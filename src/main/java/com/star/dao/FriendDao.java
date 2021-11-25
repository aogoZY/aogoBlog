package com.star.dao;

import com.star.entity.Friend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FriendDao {
    List<Friend> getAllFriendList();

    int saveFriend(Friend friend);

    int updateFriend(Friend friend);

    int delete(long id);

    Friend getFriendByName(String name);

    Friend getFriendById(long id);
}
