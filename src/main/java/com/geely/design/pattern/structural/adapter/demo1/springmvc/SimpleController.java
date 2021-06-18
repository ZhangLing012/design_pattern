package com.geely.design.pattern.structural.adapter.demo1.springmvc;

class SimpleController implements Controller {
    void doSimplerHandler() {
        System.out.println("simple...");
    }
}
