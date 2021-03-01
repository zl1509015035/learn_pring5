package com.zhul.spring5.testdemo;

import com.zhul.spring5.config.SpringConfig;
import com.zhul.spring5.service.UseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo1 {

    @Test
    public void testService1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UseService useService = context.getBean("useService", UseService.class);
        System.out.println(useService);
        useService.add();
    }


    @Test
    public void testService2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UseService useService = context.getBean("useService", UseService.class);
        System.out.println(useService);
        useService.add();
    }
}
