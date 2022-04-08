package com.hong.singleton.seriable;

import java.io.Serializable;

/**
 * @author hong
 */
public class SeriableSingleton implements Serializable {
    //序列化
    //把内存中对象的状态转化为字节码的形式
    //把字节码通过IO输出流输出到磁盘
    //永久保存下来，持久化，比如redis持久化

    //反序列化
    //将持久化的字节码内容，通过IO输入流读到内存中
    //转化成一个Java对象
    private static final SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton() {}
    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
    //解决方法
    private Object readResolve() {
        return INSTANCE;
    }
}
