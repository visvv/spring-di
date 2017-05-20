package vv.spring.di.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vasudvis on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Job jobImpl = applicationContext.getBean(Job.class);
        jobImpl.doJob();
    }
}
