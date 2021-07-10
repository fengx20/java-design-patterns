package com.fengx.design_patterns.decorator_pattern;

/**
 * @author: Fengx
 * @create: 2021-07-05
 * @description: 4、创建扩展了 ShapeDecorator 类的实体装饰类
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color：Red");
    }
}
