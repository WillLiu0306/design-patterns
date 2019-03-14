package com.lwh.prototype.work;

import java.math.BigDecimal;

public class SubmitOrderCommand {
    private Long orderId;
    private String userName;
    private Long useTime;
    private BigDecimal totalCount;
    private String deptAddress;
    private String arriveAddress;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUseTime() {
        return useTime;
    }

    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public String getArriveAddress() {
        return arriveAddress;
    }

    public void setArriveAddress(String arriveAddress) {
        this.arriveAddress = arriveAddress;
    }

    @Override
    public String toString() {
        return "SubmitOrderCommand{" +
                "orderId=" + orderId +
                ", userName='" + userName + '\'' +
                ", useTime=" + useTime +
                ", totalCount=" + totalCount +
                ", deptAddress='" + deptAddress + '\'' +
                ", arriveAddress='" + arriveAddress + '\'' +
                '}';
    }
}
