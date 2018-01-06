package top.duckduck.module.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.duckduck.module.user.dao.UserDao;
import top.duckduck.module.user.entity.User;

@RestController
@RequestMapping("/session")
public class SessionController {
    
    @Autowired
    private UserDao userDao;
    
    @PostMapping("/")
    public User getUserById(@RequestParam String username,@RequestParam String password) {
//        ExampleMatcher matcher = ExampleMatcher.matchingAll();
//        matcher.withMatcher("username", GenericPropertyMatchers.)
        return null;
    }
	
}
