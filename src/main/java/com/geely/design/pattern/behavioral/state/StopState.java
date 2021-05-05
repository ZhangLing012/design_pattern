package com.geely.design.pattern.behavioral.state;

public class StopState extends CourseVideoState{
   @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
       System.out.println("error 不能切换到快进状态");
    }

    @Override
    public void pause() {
        System.out.println("error 不能切换到暂停状态");
    }

    @Override
    public void stop() {
                System.out.println("停止播放视频的状态");
    }
}
