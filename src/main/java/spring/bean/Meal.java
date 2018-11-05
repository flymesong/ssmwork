package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("meal")
public class Meal implements Serializable {
    private int mealId;
    private int mealSeriesId;
    private String mealName;
    private String mealSummarize;
    private String mealDescription;
    private String mealPrice;
    private String mealImage;

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getMealSeriesId() {
        return mealSeriesId;
    }

    public void setMealSeriesId(int mealSeriesId) {
        this.mealSeriesId = mealSeriesId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealSummarize() {
        return mealSummarize;
    }

    public void setMealSummarize(String mealSummarize) {
        this.mealSummarize = mealSummarize;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealImage() {
        return mealImage;
    }

    public void setMealImage(String mealImage) {
        this.mealImage = mealImage;
    }

    public Meal() {

    }

    public Meal(int mealId, int mealSeriesId, String mealName, String mealSummarize, String mealDescription, String mealPrice, String mealImage) {

        this.mealId = mealId;
        this.mealSeriesId = mealSeriesId;
        this.mealName = mealName;
        this.mealSummarize = mealSummarize;
        this.mealDescription = mealDescription;
        this.mealPrice = mealPrice;
        this.mealImage = mealImage;
    }
}
