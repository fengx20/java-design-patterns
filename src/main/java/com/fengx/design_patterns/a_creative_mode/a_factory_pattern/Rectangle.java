package com.fengx.design_patterns.a_creative_mode.a_factory_pattern;

import com.fengx.design_patterns.a_creative_mode.a_factory_pattern.Shape;

/**
 * @author: Fengx
 * @create: 2021-07-05
 * @description: 步骤2、创建实现接口的实体类
 **/
public class Rectangle implements Shape {

    @Override
    public void draw(){
        System.out.println("Shape：Rectangle");
    }
}
