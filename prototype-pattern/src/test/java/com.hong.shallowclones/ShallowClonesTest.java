package com.hong.shallowclones;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hong
 */
public class ShallowClonesTest {
    public static void main(String[] args) {
        Student prototype = new Student();
        prototype.setName("John");
        prototype.setAge("18");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("下棋");
        hobbies.add("书法");
        prototype.setHobbies(hobbies);
        //打印
        System.out.println(prototype);
        //克隆
        Student cloneType = prototype.clone();
        //改变克隆对象
        cloneType.setAge("15");
        //打印原型和克隆对象
        System.out.println("原型对象："+prototype);
        System.out.println("克隆对象："+cloneType);

        //改变克隆对象
        cloneType.getHobbies().add("打游戏");
        //打印原型和克隆对象
        System.out.println("原型对象："+prototype);
        System.out.println("克隆对象："+cloneType);

    }
}
