package com.hong.singleton.hungry;

/**
 * @author hong
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：某些情况下，可能会造成性能浪费
 */
public class HungryStaticSingleton {
    //先静态后动态
    //先上后下
    //先属性后方法
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
