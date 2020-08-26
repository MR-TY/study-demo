package com.example.demo.service;

import com.example.demo.utils.ThreadPoolUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.*;

/**
 * @author tangyu
 * @date 2020-08-26 14:25
 */
@Service
@Transactional
public class AsyncService {

    @Autowired
    private ApplicationContext applicationContext;

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    public void testReg(){
        AsyncService asyncService = applicationContext.getBean(AsyncService.class);
        asyncService.register();
    }

    @Async
    public void register() {
        logger.info("注册多线程"+ Thread.currentThread());
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("注册多线程成功");
    }

    public void register1() {
        ExecutorService threadPoolExecutor1 = ThreadPoolUtils.getThreadPool();
        for (int i=0;i<10;i++) {
            threadPoolExecutor1.execute(() -> {
                logger.info("注册多线程");
                try {
                    Thread.sleep(2000 * 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("注册多线程成功");
            });
        }
    }

}
