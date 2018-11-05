package spring.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("mealseries")
public class Mealseries implements Serializable {
    private String seriesId;
    private String seriesName;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Mealseries() {

    }

    public Mealseries(String seriesId, String seriesName) {

        this.seriesId = seriesId;
        this.seriesName = seriesName;
    }
}
