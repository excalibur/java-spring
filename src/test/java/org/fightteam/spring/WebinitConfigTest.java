package org.fightteam.spring;

import org.junit.Test;
import org.springframework.core.Conventions;
import org.springframework.web.context.WebApplicationContext;

public class WebinitConfigTest {

    @Test
    public void test01() throws Exception {
//        SpringServletContainerInitializer
        System.out.println(WebApplicationContext.class.getName());
//        WebApplicationContextUtils
    }

    @Test
    public void test02() throws Exception {
        System.out.println(Conventions.getVariableName(new User()));
        System.out.println(Conventions.getVariableName(new Role()));
    }
}