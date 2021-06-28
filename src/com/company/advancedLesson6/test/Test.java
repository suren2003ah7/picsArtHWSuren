package com.company.advancedLesson6.test;

import com.company.advancedLesson6.model.MySingleton;
import com.company.advancedLesson6.service.MySingletonService;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Test {
    public static void useSingleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.submit(Test::f1);
        Future<String> s = service.submit(Test::f2);
        try {
            System.out.println(s.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.shutdown();
        System.out.println("End");
    }

    public static void useFixedThreadExecutor(){
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.submit(Test::f1);
        Future<String> s1 = service.submit(Test::f2);
        try {
            System.out.println(s1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.submit(Test::f1);
        Future<String> s2 = service.submit(Test::f2);
        try {
            System.out.println(s2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.submit(Test::f1);
        service.submit(Test::f1);
        service.shutdown();
        System.out.println("End");
    }

    public static void useScheduledThreadPool(){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.schedule(Test::f1, 3, TimeUnit.SECONDS);
        service.schedule(Test::f1, 1, TimeUnit.SECONDS);
        service.schedule(Test::f1, 2, TimeUnit.SECONDS);
        Future<String> s = service.schedule(Test::f2, 6, TimeUnit.SECONDS);
        try {
            System.out.println(s.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.schedule(Test::f1, 3, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(Test::f1, 2, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(Test::f1, 1, 3, TimeUnit.SECONDS);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("End");
    }

    public static void useCachedThreadPool(){
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            service.submit(Test::f1);
        }
        service.shutdown();
        System.out.println("End");
    }

    public static void useCompletableFuture(){
        ExecutorService service = Executors.newSingleThreadExecutor();
        CompletableFuture.supplyAsync(getSupplier(), service).whenComplete((data, error) -> {
            System.out.println(data);
        });
        service.shutdown();
        System.out.println("End");
    }

    public static void singletonSerialization(){
        MySingleton s1 = MySingleton.getInstance();
        s1.setNumber(10);
        s1.setText("something");
        MySingletonService.serialize(s1);
        MySingleton s2 = MySingletonService.deserialize();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // enums also solve this problem
    }

    private static Supplier<String> getSupplier() {
        return () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "respond...";
        };
    }

    private static void f1(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("respond...");
    }

    private static String f2(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "respond...";
    }
}
