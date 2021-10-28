package com.geely.design.pattern.behavioral.observer.callback.demo1;

/**
 * @program: design_pattern
 * @version:
 * @author: ling
 * @createTime: 2021-10-28 09:50
 **/
public class Test {
    public static void main(String[] args) {
        Caller call = new Caller();
        //Thread就是回调者，Runnable就是一个回调接口。Callable也是一个回调接口
        call.call(new ICallBack() {
            @Override
            public void callBack() {
                System.out.println("终于回调成功了！");
            }
        });
    }
}
