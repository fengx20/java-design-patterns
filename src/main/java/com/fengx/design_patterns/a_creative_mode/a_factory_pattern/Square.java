package com.fengx.design_patterns.a_creative_mode.a_factory_pattern;

/**
 * @author: Fengx
 * @date: 2022-08-09
 * @description: 2、创建实现接口的实体类
 **/
public class Square implements Shape{

    @Override
    public void draw(){
        System.out.println("Shape：Square");
    }
}
