package org.fightteam.spring;

import org.springframework.context.Lifecycle;

/**
 * Created by excalibur on 2014/8/21.
 */
public class Role implements Lifecycle {
    @Override
    public void start() {
        System.out.println("-------start-----------");
    }

    @Override
    public void stop() {
        System.out.println("-----------stop----------");
    }

    @Override
    public boolean isRunning() {
        System.out.println("---------isRunning--------");
        return false;
    }
}
