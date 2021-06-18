package com.geely.design.pattern.creational.factory.demo1.factorymethod;

/**
 * Created by geely
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
