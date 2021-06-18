package com.geely.design.pattern.behavioral.chainOfResponsibility.demo1;

public abstract class Approve {
    // 包含一个自己类型的对象 下一个处理者
    protected Approve approve;
    public void setNextApprove(Approve approve){
        this.approve = approve;
    }
    public abstract void deploy(Course course);
}
