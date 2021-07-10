package com.fengx.design_patterns.decorator_pattern;

/**
 * @author: 冯晓
 * @create: 2021-07-05
 * @description: 3、创建实现了 Shape 接口的抽象装饰类
 **/
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
