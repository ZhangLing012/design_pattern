package com.geely.design.pattern.structural.adapter.demo1.mvc;

public class HandlerAdapterImpl1 implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((ControllerImpl1) handler).hand1();
    }
}
