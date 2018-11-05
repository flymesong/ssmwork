package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("orderdts")
public class Orderdts implements Serializable {
    private int oDId;
    private int oId;
    private int mealId;
    private String mealPrice;
    private String mealCount;

    public Orderdts(int oDId, int oId, int mealId, String mealPrice, String mealCount) {
        this.oDId = oDId;
        this.oId = oId;
        this.mealId = mealId;
        this.mealPrice = mealPrice;
        this.mealCount = mealCount;
    }

    public int getoDId() {
        return oDId;
    }

    public void setoDId(int oDId) {
        this.oDId = oDId;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealCount() {
        return mealCount;
    }

    public void setMealCount(String mealCount) {
        this.mealCount = mealCount;
    }

    public Orderdts() {

    }
}
