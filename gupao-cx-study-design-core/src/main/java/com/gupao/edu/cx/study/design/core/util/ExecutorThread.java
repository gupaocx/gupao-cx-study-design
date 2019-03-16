package com.gupao.edu.cx.study.design.core.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 11:38 <br>
 */
public class ExecutorThread {

    /**
     * @param runHandler
     * @param executeCount    发起请求的总数
     * @param concurrentCount 同时并发请求的数量
     */
    public static void execute(final RunHandler runHandler, int executeCount, int concurrentCount) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //控制并发的数量
        final Semaphore semaphore = new Semaphore(concurrentCount);
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    runHandler.handler();
                    semaphore.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
    }

}
