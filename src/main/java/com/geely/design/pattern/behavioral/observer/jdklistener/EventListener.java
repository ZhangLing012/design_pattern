package com.geely.design.pattern.behavioral.observer.jdklistener;

//监听器接口
public interface EventListener extends java.util.EventListener {
    //事件处理
    void handleEvent(MyEventObject event);
}
