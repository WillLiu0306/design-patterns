package com.lwh.singleton;

import java.util.concurrent.*;

public class ConcurrentExecutor {

    /*public static void execute(final RunHandler handler, int executeCount, int concurrentCount) throws Exception{
        ExecutorService executor = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(concurrentCount);
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i++) {
            executor.execute(new Runnable() {
                public void run() {
                    try {
                        semaphore.acquire();
                        handler.handler();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        executor.shutdown();
    }

    public interface RunHandler{
        void handler();
    }
*/


    public static void execute(final RunHandler handler, int executeCount, int concurrentCount)throws Exception{
        ExecutorService executor = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(concurrentCount);
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for(int i=0;i<executeCount;i++){
            executor.execute(new Runnable(){
                public void run(){
                    try{
                        semaphore.acquire();
                        handler.handler();
                        semaphore.release();
                    }catch(Exception e){
                    }

                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        executor.shutdown();



    }

    public interface RunHandler{
        void handler();
    }

}
