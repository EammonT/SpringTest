package SpringTest.aopconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//不用配置文件,完全使用注解开发
@Configuration
@ComponentScan(basePackages = {"SpringTest"})//替代<context:component-scan base-package="SpringTest.aopanno"></context:component-scan>
@EnableAspectJAutoProxy(proxyTargetClass = true)//替代<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
//配置类
public class AopConfig {
}
