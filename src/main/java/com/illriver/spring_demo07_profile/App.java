package com.illriver.spring_demo07_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();
        
        DemoBean demoBean = context.getBean(DemoBean.class);
     
        System.out.println(demoBean.getContent());
        
        context.close();
    }
}
