package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 73773 on 2017/4/25.
 */

public class Province extends DataSupport  {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProviceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void provinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
