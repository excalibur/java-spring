package org.fightteam.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class JsonTest {
    private static ObjectMapper mapper = new ObjectMapper(); // create once, reuse

    private Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat();

        cat.setUsername("jerry");
        cat.setIp("11111");
        cat.setPassword("123456");
    }

    @Test
    public void test01() throws Exception {

        String jsonString = mapper.writeValueAsString(cat);
        System.out.println(jsonString);

    }
}
