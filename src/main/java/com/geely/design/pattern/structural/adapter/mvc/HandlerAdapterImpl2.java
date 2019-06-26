package com.geely.design.pattern.structural.adapter.mvc;

public class HandlerAdapterImpl2 implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((ControllerImpl2) handler).hand2();
    }
}
