package SpringTest.aopanno;

import SpringTest.aopxml.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class testaop {
    @Test
    public void testaopanno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void testaopxml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);

    }
}
