package com.fengx.design_patterns.proxy_pattern;

/**
 * @author: 冯晓
 * @create: 2021-06-24
 * @description: 2、创建实现接口的实体类
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
