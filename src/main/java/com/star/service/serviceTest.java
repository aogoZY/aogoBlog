package com.star.service;

import com.star.dao.BlogDao;
import com.star.entity.Blog;
import com.star.queryVo.FirstPageBlog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.swing.FilePane;

import java.nio.file.FileStore;
import java.util.List;

public class serviceTest {

    @Autowired
    BlogService blogService;

    @Test
    public void getFirstPageBlogTest() {
        List<FirstPageBlog> firstPageBlogList = blogService.getFirstPageBlog();
        for (FirstPageBlog firstPageBlog : firstPageBlogList) {
            System.out.println(firstPageBlog);
        }
    }
}
