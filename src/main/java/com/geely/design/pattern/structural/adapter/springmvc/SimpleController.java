package com.geely.design.pattern.structural.adapter.springmvc;

class SimpleController implements Controller {
    void doSimplerHandler() {
        System.out.println("simple...");
    }
}
