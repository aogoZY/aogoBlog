package com.star.service;

import com.star.dao.BlogDao;
import com.star.dao.UserDao;
import com.star.entity.Blog;
import com.star.queryVo.FirstPageBlog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import sun.swing.FilePane;

import java.io.IOException;
import java.io.InputStream;
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
