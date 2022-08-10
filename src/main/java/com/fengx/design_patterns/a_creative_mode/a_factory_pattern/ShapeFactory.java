package com.fengx.design_patterns.a_creative_mode.a_factory_pattern;

/**
 * @author: Fengx
 * @date: 2022-08-09
 * @description: 步骤3、创建一个工厂，生成基于给定信息的实体类的对象。
 **/
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
