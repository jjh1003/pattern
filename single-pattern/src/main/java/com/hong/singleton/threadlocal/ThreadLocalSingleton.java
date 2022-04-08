package com.hong.singleton.threadlocal;

/**
 * @author hong
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> singletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance() {
        return singletonThreadLocal.get();
    }
}
