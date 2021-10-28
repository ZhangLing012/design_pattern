package com.geely.design.pattern.behavioral.observer.callback.demo2;

/**
 * 老师对象，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 * 老师对象有两个public方法：
 *
 * （1）回调接口tellAnswer(int answer)，即学生回答完毕问题之后，老师要做的事情
 * （2）问问题方法askQuestion()，即向学生问问题
 */
public class Teacher implements Callback {

    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        student.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是" + answer);
    }

}
