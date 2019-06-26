package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

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
