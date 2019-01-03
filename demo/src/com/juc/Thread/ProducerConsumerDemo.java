package com.juc.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerDemo
{
    public static void main(String[] args)
    {
        // 创建资源
        Resource r = new Resource();

        // 创建任务
        Producer pro = new Producer(r);
        Consumer con = new Consumer(r);

        // 多生产者
        Thread t0 = new Thread(pro);
        Thread t1 = new Thread(pro);

        // 多消费者
        Thread t2 = new Thread(con);
        Thread t3 = new Thread(con);
        Thread t4 = new Thread(con);
        Thread t5 = new Thread(con);

        // 开启线程
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}