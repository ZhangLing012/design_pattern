package com.geely.design.pattern.behavioral.state.demo1;

/**
 * 课程视频state
 * @author daling
 */
public  abstract class CourseVideoState {
    protected  CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
