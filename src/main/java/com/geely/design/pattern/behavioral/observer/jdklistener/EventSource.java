package com.geely.design.pattern.behavioral.observer.jdklistener;

import java.util.Vector;
// 事件源是事件对象的入口，包含监听器的注册、撤销、通知

public class EventSource {
    //监听器列表，监听器的注册则加入此列表
    private Vector<EventListener> ListenerList = new Vector<EventListener>();

    //注册监听器
    public void addListener(EventListener eventListener) {
        ListenerList.add(eventListener);
    }

    //撤销注册
    public void removeListener(EventListener eventListener) {
        ListenerList.remove(eventListener);
    }

    //接受外部事件
    public void notifyListenerEvents(MyEventObject event) {
        for (EventListener eventListener : ListenerList) {
            eventListener.handleEvent(event);
        }
    }
    public void onCloseWindows(EventListener eventListener){
        System.out.println("关注关闭窗口事件");
        ListenerList.add(eventListener);
    }

    public void doCloseWindows(){
        this.notifyListenerEvents(new MyEventObject("closeWindows"));
    }

}
