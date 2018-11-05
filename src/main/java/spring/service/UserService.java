package spring.service;

import spring.bean.Users;

public interface UserService {
    public Users login(String loginName, String loginPwd);
    Users search(String loginName);
    public int append(Users user);
    public  int update( Users user);
    int delete(Users user);
}
