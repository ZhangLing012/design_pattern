package com.geely.design.pattern.behavioral.chainOfResponsibility.demo1;

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

        // 利用java8写
        // Consumer<Course> articleConsumer = (courses) -> System.out.println(courses.getName());
        // Consumer<Course> videoConsumer = (courses) -> System.out.println(courses.getName());
        // articleConsumer.accept(Course.builder()
        //                              .article("a")
        //                              .name("san")
        //                              .build());
        // videoConsumer.accept(Course.builder()
        //                            .article("b")
        //                            .name("si")
        //                            .build());
        // articleConsumer.andThen(videoConsumer);
    }
}
