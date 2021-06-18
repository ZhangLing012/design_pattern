package com.geely.design.pattern.structural.decorator.demo1.v2;

/**
 * Created by geely
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}