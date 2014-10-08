package org.fightteam.spring;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class MapTest {
    private static final Map map;
    static {
        Map aMap = new HashMap();
        aMap.put(1, "one");
        aMap.put(2, "two");
        map = Collections.unmodifiableMap(aMap);
    }


    @Test
    public void test01() throws Exception {
        System.out.println(map);

    }

    @Test
    public void test02() throws Exception {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put(null, null);
    }

    @Test
    public void test03() throws Exception {

        try {
            exceptionTest(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void exceptionTest(String str){
        if (str == null){
            throw new NullPointerException("空指针了");
        }
        System.out.println("结束了");
    }

    @Test
    public void test04() {
        ExceptionTest exceptionTest = new ExceptionTest(null);

    }

    @Test
    public void test05() throws Exception {
        String str = "programcreek";
        Pattern p = Pattern.compile(".*program(?=creek).*");
        Matcher m = p.matcher(str);

        if(m.matches()){
            System.out.println("Match!");
        }else{
            System.out.println("No");
        }

    }


    @Test
    public void test06() throws Exception {
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do{
            x = sc.nextInt();
            System.out.print(x + " ");
        }while(x != 0);

    }

    @Test
    public void test07() throws Exception {

    }
}
