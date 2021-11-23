package com.star.daoTest;


import com.star.dao.TypeDao;
import com.star.entity.Type;
import com.star.entity.User;
import com.star.myBlogApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = myBlogApplication.class)
public class typeTest {
    @Autowired
    private TypeDao typeDao;

    //    根据id查询type信息
    @Test
    public void getTypeByIdTest() {
        Type type = typeDao.getTypeById(3l);
        System.out.println(type);
    }

    //    新增type
    @Test
    public void saveTypeTest() {
        Type type = new Type();
        type.setName("study");
        Type existedType = typeDao.getTypeByName(type.getName());
        if (existedType != null) {
            System.out.println(type.getName() + "has already existed");
        } else {
            int affected = typeDao.saveType(type);
            if (affected > 0) {
                System.out.println("insert success");
            } else {
                System.out.println("failed");
            }

        }

    }

    //    查询所有types
    @Test
    public void queryAllTypes() {
        List<Type> typeList = typeDao.getAllType();
//        System.out.println(typeList);
        for (Type type : typeList) {
            System.out.println(type.toString());
        }
    }

    @Test
    public void deleteTest() {
        int affected = typeDao.deleteType(59l);
        if (affected > 0) {
            System.out.println("delete success");
        } else {
            System.out.println("delete failed");
        }
    }
}
