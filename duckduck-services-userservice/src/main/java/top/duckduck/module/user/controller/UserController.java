package top.duckduck.module.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.duckduck.module.user.dao.UserDao;
import top.duckduck.module.user.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserDao userDao;
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userDao.findOne(id);
    }
	
}
