package com.star.dao;

import com.star.queryVo.FirstPageBlog;
import com.star.queryVo.RecommendBlog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {
    List<FirstPageBlog> getFirstPageBlog();

    List<RecommendBlog> getRecommendBlog();

    List<FirstPageBlog> getTypeById(Long typeId);

}
