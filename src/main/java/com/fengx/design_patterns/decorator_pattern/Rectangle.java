package com.fengx.design_patterns.decorator_pattern;

/**
 * @author: Fengx
 * @create: 2021-07-05
 * @description: 2、创建实现接口的实体类
 **/
public class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Shape：Rectangle");
    }
}
