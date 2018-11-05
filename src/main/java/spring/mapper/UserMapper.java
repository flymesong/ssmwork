package spring.mapper;

import org.apache.ibatis.annotations.Param;
import spring.bean.Users;

public interface UserMapper {
    Users login(@Param("loginName") String loginName, @Param("loginPwd") String loginPwd);
    Users search(@Param("loginName") String loginName);
    int append(Users user);
    int update(Users user );
    int delete(Users user);

}
