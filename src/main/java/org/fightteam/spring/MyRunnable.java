package org.fightteam.spring;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        synchronized (this){
            System.out.println("--------");
            System.out.println("test开始..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束..");
        }
    }
}
