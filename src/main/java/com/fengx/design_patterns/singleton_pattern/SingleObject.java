package com.fengx.design_patterns.singleton_pattern;

/**
 * @author: 冯晓
 * @create: 2021-07-09
 * @description: 1、创建一个 Singleton 类
 **/
public class SingleObject {

    // 创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    // 构造方法私有，这个类不会被实例化
    private SingleObject(){}

    // 获取唯一可用的对象
    public static SingleObject getIntance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world!");
    }

}
