package com.hong.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hong
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    public static Object getInstance(String className) {
        Object instance = null;
        if (!ioc.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                if (!ioc.containsKey(className)) {
                    try {
                        instance = Class.forName(className).newInstance();
                        ioc.put(className,instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return instance;
        }
        return ioc.get(className);
    }
}
