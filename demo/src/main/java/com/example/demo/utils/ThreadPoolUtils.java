package com.example.demo.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.*;

/**
 * @author tangyu
 * @date 2020-08-26 14:40
 */
@UtilityClass
public class ThreadPoolUtils {

    public ThreadPoolExecutor getThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 20, 10, TimeUnit.SECONDS,  new LinkedBlockingDeque<Runnable>(100));
        return threadPoolExecutor;
    }

    public ExecutorService getExecutorThreadPool() {
        ExecutorService sysExecutorService = Executors.newFixedThreadPool(6);
        return sysExecutorService;
    }
}
