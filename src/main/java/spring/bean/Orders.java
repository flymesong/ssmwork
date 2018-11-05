package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("orders")
public class Orders implements Serializable {
    private int oID;
    private String userId;
    private String orderTime;
    private String orderState;
    private String orderPrice;

    public int getoID() {
        return oID;
    }

    public void setoID(int oID) {
        this.oID = oID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Orders() {

    }

    public Orders(int oID, String userId, String orderTime, String orderState, String orderPrice) {

        this.oID = oID;
        this.userId = userId;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.orderPrice = orderPrice;
    }
}
