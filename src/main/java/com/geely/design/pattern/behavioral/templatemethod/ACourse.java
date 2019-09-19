package com.geely.design.pattern.behavioral.templatemethod;

/**
 * 哪些行为是固定的 哪些是教给子类 哪些是可选的
 */
public abstract class ACourse {
    // 不希望子类修改流程
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法 子类可以覆盖 来决定是否需要writeArticle方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();


}
