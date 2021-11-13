package com.star.service;

import com.star.queryVo.FirstPageBlog;
import com.star.queryVo.RecommendBlog;

import java.util.List;

public interface BlogService {
    List<FirstPageBlog> getFirstPageBlog();

    List<RecommendBlog> getRecommendBlog();
}
