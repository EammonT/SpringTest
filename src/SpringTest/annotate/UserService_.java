package SpringTest.annotate;

import org.springframework.stereotype.Component;

//value值可以不写，默认值是类名称，首字母小写  userService_
@Component(value = "userService") //相当于<bean id="userService" class="SpringTest.annotate.UserService_">
public class UserService_ {
    private String userName;
    public void add(){
        System.out.println("service2 add....");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

