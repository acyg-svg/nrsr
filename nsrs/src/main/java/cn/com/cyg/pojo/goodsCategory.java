package cn.com.cyg.pojo;

public class goodsCategory {
    private int goodsCategoryId;
    private String categoryName;

    public int getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(int goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "goodsCategory{" +
                "goodsCategoryId=" + goodsCategoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
