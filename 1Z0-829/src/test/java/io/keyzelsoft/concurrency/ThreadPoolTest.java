package io.keyzelsoft.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreadPoolTest {

    @Test
    public void testFixedThreadPoolExecution() throws InterruptedException {

        // Counter to track completed tasks
        AtomicInteger counter = new AtomicInteger();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        System.out.println("Thread : " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {

            executorService.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    counter.incrementAndGet();
                    System.out.println("Thread : " + Thread.currentThread().getName());
                }

            });
        }

        executorService.shutdown();
        boolean awaitTermination = executorService.awaitTermination(5, TimeUnit.MINUTES);

        assertEquals(10, counter.get());
        assertEquals(true, awaitTermination);
    }
}
