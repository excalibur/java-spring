package org.fightteam.spring;

import org.junit.Test;

import java.util.*;

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
}
