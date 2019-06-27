package com.geely.design.pattern.behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        Course course = new Course("java");
        course.addObserver(teacher1);
        course.addObserver(teacher2);
        course.produceQuestion(course, new Question("11", "22"));
    }
}
