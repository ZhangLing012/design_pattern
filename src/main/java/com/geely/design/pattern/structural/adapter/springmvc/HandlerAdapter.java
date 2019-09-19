package com.geely.design.pattern.structural.adapter.springmvc;

/**
 * @author Darling
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handle(Object handler);
}
