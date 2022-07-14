package SpringTest;

import SpringTest.BeanLife.Orders;
import SpringTest.FullAnnotation.SpringConfig;
import SpringTest.annotate.UserService_;
import SpringTest.autowire.Emp;
import SpringTest.collection.Book;
import SpringTest.collection.Course;
import SpringTest.collection.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlist.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlist.xml");
        Book book = context.getBean("book", Book.class);
        book.show();
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
        Course course = context.getBean("MyBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlife.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        //手动销毁bean实例
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanauto.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }

    @Test
    public void test4() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService_ userService = context.getBean("userService", UserService_.class);
        System.out.println(userService);
        userService.add();
    }
    
    @Test
    public void test5(){
    }

}



