package com.al;

public class RunnableLambda {
   
    public static void main(String[] args) throws InterruptedException {
        
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello world, I am thread [" + Thread.currentThread().getName() + "]");
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }
}
