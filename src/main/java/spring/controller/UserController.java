package spring.controller;

//import org.apache.log4j.Logger;
import spring.bean.Users;
import spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;


//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    private static Logger logger = Logger.getLogger(UserController.class);
//    private static final Logger logger = LogManager.getLogger(UserController.class);
    @ResponseBody
    @RequestMapping("login")
    public Users login(String loginName,String loginPwd){
        System.out.println("name:"+loginName);
        Users u =userService.search(loginName);
        if(u !=null){
            String userStater =u.getUserStater();
            if(userStater.equals("1")){
                Users users=userService.login(loginName,loginPwd);
                if(users  != null){
                    System.out.println("用户的name为："+loginName);
                }else{
                    System.out.println("用户名或密码错误");
                }
            }else{
                System.out.println("用户已停用");
            }
        }else{
            System.out.println("沒有该用户");
        }

        return u;
    }

    @ResponseBody
    @RequestMapping("append")
    public  Users append(String loginName, String loginPwd, String trueName, String email, String phone, String address){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = sdf.format(date);
        if(loginName ==null ||loginName.equals("") || loginPwd == null ||loginPwd.equals("")){
            System.out.println("用户名和密码不能为空");
        }
        Users users =userService.search(loginName);
        Users u = new Users();
        if(users !=null){
            u.setLoginName(loginName);
            u.setLoginPwd(loginPwd);
            u.setTrueName(trueName);
            u.setEmail(email);
            u.setPhone(phone);
            u.setAddress(address);
            u.setUserStater("1");
            u.setCreatetime(time);
            int i = userService.append(u);
            if(i>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        }else {
            System.out.println("用户名已存在");
        }

        return u;
    }
    @ResponseBody
    @RequestMapping("/update")
    public Users update(String loginName, String loginPwd, String trueName, String email, String phone, String address) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = sdf.format(date);
        if(loginName ==null ||loginName.equals("") || loginPwd == null ||loginPwd.equals("")){
            System.out.println("用户名和密码不能为空");
        }
        Users u =userService.search(loginName);
        if(u != null){
            u.setLoginPwd(loginPwd);
            if (trueName != null && !"".equals(trueName)) {
                u.setTrueName(trueName);
            }
            if(email!=null && !"".equals(email)){
                u.setEmail(email);
            }
            if(phone !=null && !"".equals(phone)) {
                u.setPhone(phone);
            }
            if (address != null && !"".equals(address)) {
                u.setAddress(address);
            }
            u.setCreatetime(time);
            int i = userService.update(u);
            System.out.println("======");
            if (i > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        }else{
            System.out.println("更新失败,没有当前用户！");
        }

        return u;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public Users update(String loginName){
        Users u =userService.search(loginName);
        if(u != null){
            u.setUserStater("0");
            int i = userService.delete(u);
            if(i>0){
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("删除失败,没有当前用户！");
        }

        return u;
    }

}
