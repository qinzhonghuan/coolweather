package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 73773 on 2017/4/25.
 */

public class City extends DataSupport {
    private int id;
    private String countyName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCoutyName(){
        return countyName;
    }
    public void setCityName(String cityName){
        this.countyName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId=provinceId;
    }
}
