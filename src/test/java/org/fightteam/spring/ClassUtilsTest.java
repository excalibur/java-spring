package org.fightteam.spring;

import org.junit.Test;
import org.springframework.util.ClassUtils;

/**
 * Created by excalibur on 2014/8/23.
 */
public class ClassUtilsTest {

    @Test
    public void test01() throws Exception {
        String shortName = ClassUtils.getShortName(User.class);

        System.out.println(shortName);

        System.out.println(ClassUtils.getQualifiedName(User.class));

    }
}
