package org.fightteam.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class ParentConfigTest {

    @Test
    public void test01() throws Exception {
        AnnotationConfigApplicationContext parent = new AnnotationConfigApplicationContext(ParentConfig.class);
        AnnotationConfigApplicationContext child = new AnnotationConfigApplicationContext(ChildConfig.class);
//        child.setParent(parent);

        User faith = child.getBean("faith", User.class);

        System.out.println(faith);
    }
}
