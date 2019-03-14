package com.lwh.proxy.dbroute;

public class OrderService implements IOrderService{

    private OrderDao orderDao;

    //正常由spring注入
    public OrderService(){
        this.orderDao = new OrderDao();
    }

    public int insert(Order order) {
        System.out.println("orderService insert order");
        return orderDao.insert(order);
    }
}
