package com.geely.design.pattern.creational.factory.demo1.simplefactory;

/**
 * 使用静态方法是这类封装常用的技巧，它的好处是不需要新建工厂对象就可以实现调用，但缺点是不具备扩展性（静态方法不能被重写
 */
public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }


    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

}
