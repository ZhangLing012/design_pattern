package com.geely.design.pattern.behavioral.chainOfResponsibility.demo1;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprove extends Approve {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            // 判断下一个approve 是否存在
            if (approve != null) {
                approve.deploy(course);
            }
        }  else{
             System.out.println(course.getName() + "不含有手记，拒绝");
             return;
        }
    }
}
