package com.geely.design.pattern.behavioral.observer.callback.demo2;

/**
 * 回调测试，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 * 回调的核心就是回调方将本身即this传递给调用方，这样调用方就可以在调用完毕之后告诉回调方它想要知道的信息
 */
public class Test {
    //类A的a()方法调用类B的b()方法
    // 类B的b()方法执行完毕主动调用类A的callback()方法
    public static void main(String[] args) {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }

}
