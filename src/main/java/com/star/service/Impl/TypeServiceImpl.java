package com.star.service.Impl;

import com.star.dao.TypeDao;
import com.star.entity.Type;
import com.star.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;

    @Override
    public List<Type> getAllTypeAndBlog() {
        return typeDao.getAllTypeAndBlog();

    }

    @Override
    public List<Type> getAllType() {
        return typeDao.getAllType();
    }

    @Override
    public Type getTypeByName(String name) {
        return typeDao.getTypeByName(name);
    }

    @Override
    public Type getTypeById(long id) {
        return typeDao.getTypeById(id);
    }

    @Override
    public int saveType(Type type) {
        return typeDao.saveType(type);
    }

}
