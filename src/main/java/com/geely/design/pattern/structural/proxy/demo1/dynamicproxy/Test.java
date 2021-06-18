package com.geely.design.pattern.structural.proxy.demo1.dynamicproxy;

import com.geely.design.pattern.structural.proxy.demo1.IOrderService;
import com.geely.design.pattern.structural.proxy.demo1.Order;
import com.geely.design.pattern.structural.proxy.demo1.OrderServiceImpl;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
