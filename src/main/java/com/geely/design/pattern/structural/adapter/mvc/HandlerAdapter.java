package com.geely.design.pattern.structural.adapter.mvc;
//定义一个Adapter接口  
public interface HandlerAdapter {
    boolean supports(Object handler);
    void handle(Object handler);
}
