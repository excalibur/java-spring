package org.fightteam.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class MyApplicationContext extends AbstractApplicationContext {
    @Override
    protected void refreshBeanFactory() throws BeansException, IllegalStateException {
        System.out.println("refreshBeanFactory");
    }

    @Override
    protected void closeBeanFactory() {
        System.out.println("closeBeanFactory");
    }

    @Override
    public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
        System.out.println("getBeanFactory");
        return null;
    }
}
