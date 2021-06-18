package com.geely.design.pattern.structural.adapter.demo1.springmvc;

class AnnotationController implements Controller {
    void doAnnotationHandler() {
        System.out.println("annotation...");
    }
}
