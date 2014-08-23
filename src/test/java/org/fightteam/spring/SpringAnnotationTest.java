package org.fightteam.spring;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by excalibur on 2014/8/14.
 */
public class SpringAnnotationTest {

    /**
     * 用javaconfig 来实例化一个spring ApplicationContext
     * @throws Exception
     */
    @Test
    public void test01() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        User faith = (User) ctx.getBean("faith");
//        System.out.println(faith);
//        User faith2 = (User) ctx.getBean("user");
//        System.out.println(faith2);

//        String[] names = ctx.getAliases("faith2");
//        for (String name : names){
//            System.out.println(name);
//        }


//        System.out.println(ctx.containsBeanDefinition("faith"));
//        System.out.println(ctx.getBeanDefinitionCount());

//        String[] names = ctx.getBeanDefinitionNames();
//        for(String name : names){
//            System.out.println(name);
//        }
//        Map<String, Object> map = ctx.getBeansWithAnnotation(Component.class);
//
//       for (String key : map.keySet()){
//           System.out.println("---------------");
//           System.out.println(key);
//           System.out.println(map.get(key));
//       }

//        String[] names = ctx.getBeanNamesForAnnotation(Component.class);
//
//        for (String name : names){
//            System.out.println(name);
//        }
//        System.out.println(ctx.getClass());
//        System.out.println(ctx.getParentBeanFactory());
//
//        System.out.println(ctx.getParent());

//        System.out.println(ctx.getId());
//        System.out.println(ctx.getApplicationName());

//        Role role = (Role) ctx.getBean("role");
//        System.out.println(role);

//        ctx.registerAlias("user", "user2");
//
//        User faith2 = (User) ctx.getBean("user2");
//        System.out.println(faith2);

//        String[] names = ctx.getAliases("faith");
//
//        for (String name : names){
//            System.out.println(name);
//        }
//
//        ctx.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
//            @Override
//            public void onApplicationEvent(ApplicationEvent applicationEvent) {
//                System.out.println(applicationEvent.getTimestamp());
//                System.out.println(applicationEvent.getSource());
//            }
//        });
//        ctx.publishEvent(new ApplicationEvent("--------") {
//            @Override
//            public Object getSource() {
//                return super.getSource();
//            }
//        });


//        System.out.println(ctx.getId());
//        System.out.println(ctx.getDisplayName());

        //User faith = ctx.getBean("fatih", User.class);
        //ctx.gett
    }

    @Test
    public void test02() throws Exception {
        Student student = new Student("faith");

//        System.out.println(student);
        Integer.toHexString(12);
        System.out.println(Integer.toHexString(1));
    }


    @Test
    public void test03() throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource resource = resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "spring-1.xml");

        System.out.println(resource.contentLength());

        System.out.println(resourceLoader.getClassLoader());

        System.out.println("12345".substring(3));

    }


    @Test
    public void test04() throws Exception {
       BeanFactoryPostProcessor beanFactoryPostProcessor = new ConfigurationClassPostProcessor();
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableListableBeanFactory beanFactory = new DefaultListableBeanFactory(ctx);
        Role role = new Role();
//        beanFactory.addBeanPostProcessor(role);

        //.beanFactory.
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);


    }


    @Test
    public void test05() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


        ctx.setAllowBeanDefinitionOverriding(false);


    }
}
