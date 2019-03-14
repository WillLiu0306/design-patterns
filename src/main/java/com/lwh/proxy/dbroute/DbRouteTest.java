package com.lwh.proxy.dbroute;

import com.lwh.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.lwh.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.util.Date;

public class DbRouteTest {
    public static void main(String[] args) {
        //静态代理
        /*OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(new OrderService(new OrderDao()));
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
        proxy.insert(order);*/

        //动态代理
        IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
        orderService.insert(order);
    }
}
