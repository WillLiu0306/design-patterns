package com.lwh.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibMeiPoTest {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_classes");

        Customer customer = (Customer)new CglibMeiPo().getInstance(Customer.class);


        customer.findLove();
        System.out.println(customer);
    }
}
