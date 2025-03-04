package com.juc.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 一、创建执行线程的方式三：实现Callable接口。相较于实现Runnable接口的方式，方法可以有返回值，并且可以抛出异常
 * 二、执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果
 */
public class testThread {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();

        // 1.执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果
        FutureTask<Integer> result = new FutureTask<>(td);
        new Thread(result).start();

        // 2.接收线程运算后的结果
        Integer sum;
        try {
            //等所有线程执行完，获取值，因此FutureTask 可用于 闭锁
            sum = result.get();
            System.out.println("-----------------------------");
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}