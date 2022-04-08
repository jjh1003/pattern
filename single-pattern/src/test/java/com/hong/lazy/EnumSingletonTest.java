package com.hong.lazy;

import com.hong.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hong
 */
public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = EnumSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
    }
}
