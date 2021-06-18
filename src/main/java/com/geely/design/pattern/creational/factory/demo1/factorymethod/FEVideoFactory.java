package com.geely.design.pattern.creational.factory.demo1.factorymethod;

/**
 * Created by geely
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
