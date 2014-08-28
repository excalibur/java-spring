package org.fightteam.spring;

import org.junit.Test;
import org.springframework.util.ClassUtils;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by excalibur on 2014/8/23.
 */
public class ClassUtilsTest {
    private static final String NAME_PATH = "111";

    @Test
    public void test01() throws Exception {
        String shortName = ClassUtils.getShortName(User.class);

        System.out.println(shortName);

        System.out.println(ClassUtils.getQualifiedName(User.class));

    }


    @Test
    public void test02() throws Exception {
        System.out.println(User.class);
        System.out.println(List.class);
        System.out.println(Long[].class);
        System.out.println(ArrayList.class.getName());


    }

    @Test
    public void test03() throws Exception {

        System.out.println("====start=====");

//        System.out.println(Permission.class);
//        System.out.println(ClassUtils.getClassFileName(Permission.class));
//        System.out.println(ClassUtils.forName(Permission.class.getName(), ClassUtils.getDefaultClassLoader()));
//        System.out.println(Class.forName(Permission.class.getName()));
//        System.out.println(Class.forName(Permission.class.getName(), false, ClassUtils.getDefaultClassLoader()));

//        System.out.println();

        System.out.println("====end=====");
    }

    @Test
    public void test04() throws Exception {
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = null;
        try {
            resources = ClassUtils.getDefaultClassLoader().getResources("org/fightteam/spring");
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (resources.hasMoreElements()) {

            System.out.println();

            File file = new File(resources.nextElement().getFile());
            System.out.println(file.isDirectory());
            if(file.isDirectory()){
                File[] children = file.listFiles();
                for(File c : children){
                    System.out.println(c.getName());
                    System.out.println(c.getClass());
                }
            }
        }


    }

    int align2grant(int i, int grain){
        return ((i + grain-1) & ~(grain-1));
    }

    @Test
    public void test05() throws Exception {
        // i 01; 10
        // grain 10; 01 10

        System.out.println(align2grant(1, 2));

    }

    @Test
    public void test06() throws Exception {

    }
}
