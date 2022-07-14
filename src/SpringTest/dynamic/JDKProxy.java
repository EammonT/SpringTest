package SpringTest.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDAO.class};
        //创建接口实现类代理对象
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        })
        User user = new User();
        UserDAO userDAO = (UserDAO) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDAOProxy(user));
        int result = userDAO.add(1, 2);
        System.out.println("result:"+result);
    }
}
//创建代理对象代码
class UserDAOProxy implements InvocationHandler{
    //1把创建的是?的代理对象，把?传递过来
    //有参数构造器
    private Object obj;
    public UserDAOProxy(Object obj){
        this.obj = obj;
    }
    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行。。。。"+method.getName()+":传递的参数..."+ Arrays.toString(args));
        //增强的方法
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行。。。。"+obj);
        return res;
    }
}