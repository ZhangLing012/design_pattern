package com.geely.design.pattern.structural.adapter.springmvc;   //下面编写适配器类

/**
 * @author Darling
 */
public class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

}


