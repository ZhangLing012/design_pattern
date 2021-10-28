package com.geely.design.pattern.behavioral.observer.listener;

/**
 * @program: design_pattern
 * @version:
 * @author: ling
 * @createTime: 2021-10-27 17:41
 **/
public class Test {

    public static void main(String[] args) {
        // 事件源：拥有事件
        // 监听器：监听事件源所拥有的事件（带事件对象参数的）
        // 事件对象：事件对象封装了事件源对象
        // 事件源要与监听器有关系，就得注册监听器【提供方法得到监听器对象】
        // 触发事件源的事件，实际会提交给监听器对象处理，并且把事件对象传递过去给监听器。

        Person person = new Person();
        //注册监听器()
        person.registerLister(new PersonListener() {
            @Override
            public void doEat(Event event) {
                Person person1 = event.getResource();
                System.out.println(person1 + "正在吃饭呢！");
            }

            @Override
            public void doSleep(Event event) {
                Person person1 = event.getResource();
                System.out.println(person1 + "正在睡觉呢！");
            }
        });
        //当调用eat方法时，触发事件，将事件对象传递给监听器，最后监听器获得事件源，对事件源进行操作
        person.Eat();
    }


}
