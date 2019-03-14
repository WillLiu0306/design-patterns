package com.lwh.proxy.dbroute.proxy;

import com.lwh.proxy.dbroute.IOrderService;
import com.lwh.proxy.dbroute.Order;
import com.lwh.proxy.dbroute.db.DynamicDatasourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int insert(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDatasourceEntity.set(dbRouter);

        this.orderService.insert(order);
        DynamicDatasourceEntity.restore();

        return 0;
    }
}
