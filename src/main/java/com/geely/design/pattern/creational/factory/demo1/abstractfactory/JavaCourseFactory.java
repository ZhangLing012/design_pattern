package com.geely.design.pattern.creational.factory.demo1.abstractfactory;

/**
 * Created by geely
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
