package com.geely.design.pattern.structural.adapter.mvc;

public class HandlerAdapterImpl1 implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((ControllerImpl1) handler).hand1();
    }
}
