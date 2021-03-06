package cn.tonlyshy.pojo.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("bean")
public class BeanAnnotation {
    public void say(String arg) {
        System.out.println("BeanAnnotation :" + arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation :" + this.hashCode());
    }
}
