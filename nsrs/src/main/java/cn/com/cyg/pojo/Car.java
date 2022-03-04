package cn.com.cyg.pojo;

public class Car {
    private int carId;
    private int username;
    private String goodsName;
    private double price;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", username=" + username +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }
}
