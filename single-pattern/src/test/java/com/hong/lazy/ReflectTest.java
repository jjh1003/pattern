package com.hong.lazy;

import com.hong.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hong
 * 反射破坏单例
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = LazyStaticInnerClassSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object instance1 = constructor.newInstance();
        Object instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1==instance2);
    }
}
