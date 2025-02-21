package com.aurionpro.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {
	public static void main(String[] args) throws Exception {
		
		Runnable runnable = () -> System.out.println("Inside Thread");
		
		Callable callable = () -> Math.random();
		
		runnable.run();
		
		double num = (double)callable.call();
		
		System.out.println(num);
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		service.execute(runnable);
		
		Future<?> runRun = service.submit(runnable);
				
		Future<Double> future = service.submit(callable);
		
		System.out.println(future.get());
		
		service.shutdown();
		
	}
}
