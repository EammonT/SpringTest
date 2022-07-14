package SpringTest.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonProxy {
    //前置方法
    //before注解表示作为前置通知
    @Order(2)
    @Before(value = "execution(* SpringTest.aopanno.User.add())")
    public void before(){
        System.out.println("Person before....");
    }
}
