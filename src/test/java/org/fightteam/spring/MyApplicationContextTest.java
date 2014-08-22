package org.fightteam.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.DefaultLifecycleProcessor;

import static org.junit.Assert.*;

public class MyApplicationContextTest {

    @Test
    public void test01() throws Exception {
        MyApplicationContext myApplicationContext = new MyApplicationContext();
        myApplicationContext.refresh();
    }

    @Test
    public void test02() throws Exception {

        for (int i = 0; i < 3; i++) {
            MyRunnable runnable = new MyRunnable();
            Thread thread = new Thread(runnable);
            thread.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test03() throws Exception {
        DefaultLifecycleProcessor defaultProcessor = new DefaultLifecycleProcessor();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println( ctx.getBeanFactory());
        defaultProcessor.setBeanFactory(ctx.getBeanFactory());
        defaultProcessor.onRefresh();
//        defaultProcessor.setBeanFactory(beanFactory);

    }

    @Test
    public void test04() throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("===================");
            }
        }));

    }
}