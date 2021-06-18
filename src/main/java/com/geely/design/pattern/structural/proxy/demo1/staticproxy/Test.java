package com.geely.design.pattern.structural.proxy.demo1.staticproxy;

import com.geely.design.pattern.structural.proxy.demo1.Order;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
