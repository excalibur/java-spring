package org.fightteam.spring;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class ExceptionTest {

    public ExceptionTest(String str) throws NullPointerException{
        if (str == null){
            throw new NullPointerException("空指针了");
        }
        System.out.println("结束了");
    }
}
