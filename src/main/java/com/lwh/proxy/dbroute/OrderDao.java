package com.lwh.proxy.dbroute;

public class OrderDao {
    public int insert(Order order){
        System.out.println("orderDao insert order");
        return 1;
    }
}
