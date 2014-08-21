package org.fightteam.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
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
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

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

        ctx.registerAlias("user", "user2");
//
//        User faith2 = (User) ctx.getBean("user2");
//        System.out.println(faith2);

        String[] names = ctx.getAliases("faith");

        for (String name : names){
            System.out.println(name);
        }
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
}
