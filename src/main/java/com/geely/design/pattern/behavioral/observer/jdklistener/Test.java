package com.geely.design.pattern.behavioral.observer.jdklistener;

/**
 * @program: design_pattern
 * @version:
 * @author: ling
 * @createTime: 2021-10-28 09:59
 **/
public class Test {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.addListener(new EventListener() {
            @Override
            public void handleEvent(MyEventObject event) {
                event.doEvent();
                if (event.getSource().equals("closeWindows")) {
                    System.out.println("doClose");
                }
            }
        });
        /*
         * 传入openWindows事件，通知listener，事件监听器，
         对open事件感兴趣的listener将会执行
         **/
        eventSource.notifyListenerEvents(new MyEventObject("openWindows"));

        eventSource.onCloseWindows(new EventListener(){
            @Override
            public void handleEvent(MyEventObject event) {
                event.doEvent();
                if(event.getSource().equals("closeWindows")){
                    System.out.println("通过onCloseWindows来关注关闭窗口事件：并执行成功。 closeWindows");
                }
            }
        });
       //窗口关闭动作
        eventSource.doCloseWindows();
    }
}
