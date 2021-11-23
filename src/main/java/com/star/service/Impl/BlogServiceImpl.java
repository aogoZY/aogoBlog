package com.star.service.Impl;

import com.star.dao.BlogDao;
import com.star.queryVo.FirstPageBlog;
import com.star.queryVo.RecommendBlog;
import com.star.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<FirstPageBlog> getFirstPageBlog() {
        return blogDao.getFirstPageBlog();
    }

    @Override
    public List<RecommendBlog> getRecommendBlog() {
        return blogDao.getRecommendBlog();
    }

    @Override
    public List<FirstPageBlog> getByTypeId(long typeId) {
        return blogDao.getByTypeId(typeId);
    }


}
