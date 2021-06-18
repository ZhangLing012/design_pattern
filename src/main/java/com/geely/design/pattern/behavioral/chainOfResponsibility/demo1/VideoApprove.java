package com.geely.design.pattern.behavioral.chainOfResponsibility.demo1;

import org.apache.commons.lang3.StringUtils;

public class VideoApprove extends Approve {
    @Override
    public void deploy(Course course) {
         if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approve != null) {
                approve.deploy(course);
            }
        }  else{
             System.out.println(course.getName() + "不含有视频，拒绝");
             return;
        }
    }
}
