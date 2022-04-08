package com.hong.singleton.register;

import lombok.Getter;
import lombok.Setter;


/**
 * @author hong
 */

public enum EnumSingleton {
    //单例
    INSTANCE;
    @Getter
    @Setter
    private Object object;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
