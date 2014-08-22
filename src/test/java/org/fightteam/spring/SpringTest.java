package org.fightteam.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.StandardEnvironment;

/**
 * Created by excalibur on 2014/8/5.
 */
public class SpringTest {


    @Test
    public void test01() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {" spring-1.xml "});


        User empty = (User) context.getBean("empty");
        User faith = (User) context.getBean("faith");

        System.out.println(empty);
        System.out.println(faith);
    }

    @Test
    public void test02() throws Exception {
        ApplicationContext parent = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-1.xml"});


        ApplicationContext child = new ClassPathXmlApplicationContext(new String[] {"classpath*:spring-2.xml"}, parent);

        User empty = (User) child.getBean("empty");
        User faith = (User) child.getBean("faith");

        System.out.println(empty);
        System.out.println(faith);

        User empty2 = (User) child.getBean("empty2");
        User faith2 = (User) child.getBean("faith2");

        System.out.println(empty2);
        System.out.println(faith2);

    }

    @Test
    public void test03() throws Exception {
        ApplicationContext parent = new ClassPathXmlApplicationContext(new String[] {"spring-*.xml"});


        User empty = (User) parent.getBean("empty");
        User faith = (User) parent.getBean("faith");

        System.out.println(empty);
        System.out.println(faith);

        User empty2 = (User) parent.getBean("empty2");
        User faith2 = (User) parent.getBean("faith2");

        System.out.println(empty2);
        System.out.println(faith2);

    }

    @Test
    public void test04() throws Exception {
        StandardEnvironment environment = new StandardEnvironment();

        System.out.println(environment);
        System.out.println(environment.acceptsProfiles(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME));
        System.out.println(environment.acceptsProfiles(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME));
        System.out.println(environment.acceptsProfiles(AbstractEnvironment.IGNORE_GETENV_PROPERTY_NAME));

        System.out.println(environment.resolvePlaceholders("${JAVA_HOME}aaaa"));
        System.out.println(environment.resolvePlaceholders("$[JAVA_HOME]aaaa"));
        System.out.println(environment.resolvePlaceholders("$(JAVA_HOME)aaaa"));
    }
}
