package com.geely.design.pattern.behavioral.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
      Approve articleApprove = new ArticleApprove();
      Approve videoApprove = new VideoApprove();
      Course course = new Course();
      course.setName("设计模式");
      course.setArticle("手记");
      course.setVideo("视频");

      articleApprove.setNextApprove(videoApprove);
      articleApprove.deploy(course);
    }
}
