package SpringTest.aopanno;

import org.springframework.stereotype.Component;

@Component
public class User {
    //被增强的类
    public void add(){
        System.out.println("add....");
    }
}
