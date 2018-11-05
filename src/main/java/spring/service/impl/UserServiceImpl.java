package spring.service.impl;

import spring.bean.Users;
import spring.mapper.UserMapper;
import spring.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;

    @Override
    public Users login(String loginName, String loginPwd) {
        return userMapper.login(loginName,loginPwd);
    }

    @Override
    public Users search(String loginName) {
        return userMapper.search(loginName);
    }

    @Override
    public int append(Users user) {
        return userMapper.append(user);
    }
    @Override
    public int update( Users user ) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Users user) {
        return userMapper.delete(user);
    }
}
