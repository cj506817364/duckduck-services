package top.duckduck.module.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.duckduck.module.user.dao.UserDao;
import top.duckduck.module.user.entity.User;
import top.duckduck.module.user.service.UserService;

@Service
public class UserSericeImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Override
    public User getById(Long id) {
        return userDao.findOne(id);
    }
}
