package cn.com.cyg.pojo;

public class Order {
    private int orderId;
    private String goodsName;
    private int goodsNumber;
    private int username;
    private String time;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsNumber=" + goodsNumber +
                ", username=" + username +
                ", time='" + time + '\'' +
                '}';
    }
}
