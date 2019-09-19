package com.geely.design.pattern.structural.adapter.springmvc;

public interface HandlerAdapter{
        public boolean supports(Object handler);
            public void handle(Object handler);
        }
