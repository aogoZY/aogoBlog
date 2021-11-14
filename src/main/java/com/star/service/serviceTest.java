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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@DirtiesContext
public class serviceTest {

    @Autowired
    BlogService blogService;

    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;


    @Before
    public void init() throws IOException {
//        1、读取配置文件
        in = Resources.getResourceAsStream("application-dev.yml");
//        2、创建sqlSessionFactory的构建对象
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
//        3、使用构造者创建工厂对象 sqlSessionFactory
        SqlSessionFactory factory = factoryBuilder.build(in);
//        4、使用selSessionFactory生产 sqlSession 对象
        sqlSession = factory.openSession(true);
//        5、使用sqlSession创建dao接口的代理对象
        userDao = sqlSession.getMapper(UserDao.class);

    }

    @After
    public void destroy() throws Exception {
        sqlSession.close();
        in.close();
    }


    @Test
    public void getFirstPageBlogTest() {
        List<FirstPageBlog> firstPageBlogList = blogService.getFirstPageBlog();
        for (FirstPageBlog firstPageBlog : firstPageBlogList) {
            System.out.println(firstPageBlog);
        }
    }
}
