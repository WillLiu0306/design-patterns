package com.lwh.prototype.work;

import org.apache.commons.beanutils.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;

public class EventTransferUtil {
    public static SubmitOrderEvent toSubmitOrderEvent(SubmitOrderCommand command){
        SubmitOrderEvent event = new SubmitOrderEvent();
        try {
            BeanUtils.copyProperties(event,command);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return event;
    }

    public static void main(String[] args) {
        SubmitOrderCommand command = new SubmitOrderCommand();
        command.setOrderId(12345L);
        command.setUserName("lwh");
        command.setUseTime(new Date().getTime());
        command.setTotalCount(BigDecimal.TEN);
        command.setDeptAddress("机场");
        command.setArriveAddress("酒店");

        System.out.println(command);

        System.out.println(toSubmitOrderEvent(command));
    }
}
