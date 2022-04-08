package com.hong.lazy;

import com.hong.singleton.seriable.SeriableSingleton;

import java.io.*;

/**
 * @author hong
 */
public class SeriabelSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            //写入磁盘
             fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(s2);
            os.flush();
            os.close();
            //读到内存
            FileInputStream fins = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ins = new ObjectInputStream(fins);
            s1 = (SeriableSingleton) ins.readObject();
            ins.close();
            //比较
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
