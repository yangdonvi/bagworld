package com.donvi.admin.entity;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
public class GoodsDetail {
    private String detailCode;
    private String detailNameCn;
    private String detailNameEng;
    private String firstParentCode;
    private String secondParentCode;
    private String brandCode;
    private String picName;

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public String getDetailNameCn() {
        return detailNameCn;
    }

    public void setDetailNameCn(String detailNameCn) {
        this.detailNameCn = detailNameCn;
    }

    public String getDetailNameEng() {
        return detailNameEng;
    }

    public void setDetailNameEng(String detailNameEng) {
        this.detailNameEng = detailNameEng;
    }

    public String getFirstParentCode() {
        return firstParentCode;
    }

    public void setFirstParentCode(String firstParentCode) {
        this.firstParentCode = firstParentCode;
    }

    public String getSecondParentCode() {
        return secondParentCode;
    }

    public void setSecondParentCode(String secondParentCode) {
        this.secondParentCode = secondParentCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }
}
