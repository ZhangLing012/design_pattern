package com.geely.design.pattern.structural.adapter.springmvc;

/**
 * @author Darling
 */
public class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

}
