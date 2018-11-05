package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("admin")
public class Admin implements Serializable {
    private int id;
    private String loginName;
    private String loginPwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Admin() {

    }

    public Admin(int id, String loginName, String loginPwd) {

        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }
}
