package com.fengx.design_patterns.proxy_pattern;

/**
 * @author: Fengx
 * @create: 2021-07-05
 * @description: 3、当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
 **/
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
