package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它所有的观察者都会收到通知并更新。
 * 关联行为场景，建立一套触发机制
 * 观察者和被观察者之间建立和一个抽象的耦合
 * 支持广播通信
 *
 */
public class Teacher implements Observer {
    private String teacherNmae;

    public Teacher(String teacherNmae) {
        this.teacherNmae = teacherNmae;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherNmae + "收到" + question.getUserName() + "---" + question.getQuestionContent());

    }
}
