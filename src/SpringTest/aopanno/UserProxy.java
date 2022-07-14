package SpringTest.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect //生成代理对象
@Order(1)
//增强类
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* SpringTest.aopanno.User.add())")
    public void poinrdemo(){

    }

    //前置方法
    //before注解表示作为前置通知
    @Before(value = "poinrdemo()")
    public void before(){
        System.out.println("before....");
    }

    //最终通知
    //被增强方法执行之后执行
    //不管是否有异常，都执行
    @After(value = "poinrdemo()")
    public void after(){
        System.out.println("after....");
    }

    //后置通知（返回通知）
    //被增强方法返回值之后执行
    //有异常不执行
    @AfterReturning(value = "poinrdemo()")
    public void afterReturning(){
        System.out.println("AfterReturning....");
    }
    //被增强方法异常时执行
    @AfterThrowing(value = "poinrdemo()")
    public void afterThrowing(){
        System.out.println("AfterThrowing....");
    }

    @Around(value = "poinrdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("around afrer....");
    }
}
