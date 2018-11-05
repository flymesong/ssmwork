package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("user")
public class Users implements Serializable {
    private int id;
    private  String loginName;
    private  String loginPwd;
    private String trueName;
    private String email;
    private String phone;
    private String address;
    private String userStater;
    private String createtime;


    public Users(int id, String loginName, String loginPwd, String trueName, String email, String phone, String address,String userStater, String createtime) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.trueName = trueName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.userStater = userStater;
        this.createtime = createtime;
    }

    public Users() {
    }

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

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserStater() {
        return userStater;
    }

    public void setUserStater(String userStater) {
        this.userStater = userStater;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
