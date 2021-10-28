package com.geely.design.pattern.behavioral.observer.callback.demo1;

/**
 * 回调者（用于调用回调函数的类）
 */
public class Caller {
    public void call(ICallBack callBack){
        System.out.println("start...");
        callBack.callBack();
        System.out.println("end...");
    }

}
