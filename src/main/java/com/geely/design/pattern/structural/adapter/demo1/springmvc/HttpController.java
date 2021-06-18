package com.geely.design.pattern.structural.adapter.demo1.springmvc;

class HttpController implements Controller {
    void doHttpHandler() {
        System.out.println("http...");
    }
}
