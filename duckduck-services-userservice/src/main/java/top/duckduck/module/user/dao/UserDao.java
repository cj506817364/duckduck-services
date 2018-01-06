package top.duckduck.module.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import top.duckduck.module.user.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
    
}
