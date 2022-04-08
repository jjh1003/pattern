package com.hong.singleton.lazy;

/**
 * @author hong
 * LazyStaticInnerClassSingleton.class
 * LazyStaticInnerClassSingleton$LazyHolder.class内部类不会优先加载，用到时才会被加载
 * 优点：写法优雅，利用了Java本身的语法特点,性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许访问");
        }
    }
    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
