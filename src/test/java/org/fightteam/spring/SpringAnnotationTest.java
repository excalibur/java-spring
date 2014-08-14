package org.fightteam.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        //1
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User faith = (User) ctx.getBean("faith");
        System.out.println(faith);

    }
}
