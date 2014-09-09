package org.fightteam.spring;

import org.junit.Test;
import org.springframework.util.ClassUtils;

import java.io.File;
import java.net.URL;
import java.util.*;

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
        boolean a = true;
        byte b = 1;
        short c = 1;
        char d = 'c';
        int e = 1;
        float f = 1.1F;
        double g = 1.1;



    }

    @Test
    public void test07() throws Exception {
        // 用来分析jvm
        List<User> users = new ArrayList<User>();

        for (;;){
            users.add(new User());
        }

    }

    @Test
    public void test08() throws Exception {
//        com.sun.tools.javac.main.Main compiler =
//                new com.sun.tools.javac.main.Main("javac");
        
    }

    @Test
    public void test09() throws Exception {

//        String[] arr = new String[]{"a", "b", "c"};
//        List<String> list = Arrays.asList(arr);
//        System.out.println(list);
//        list.add("d");
//        System.out.println(list);


//        String[] arr = new String[]{"a", "b", "c"};
//        List<String> list = new ArrayList<String>(Arrays.asList(arr));
//        System.out.println(list);
//        list.add("d");
//        System.out.println(list);

//        String[] arr = new String[]{"a", "b", "c"};
//        Set<String> set = new HashSet<String>(Arrays.asList(arr));
//        System.out.println(set.contains("b"));

//        String[] arr = new String[]{"a", "b", "c"};
//        System.out.println(Arrays.asList(arr).contains("b"));

//        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i);
//            System.out.println(list.get(i));
//            list.remove(i);
//        }
//        System.out.println(list);

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for(String a : list){
            System.out.println(a);
            list.remove(a);
        }
        System.out.println(list);
    }
}
