package com.donvi.admin.entity;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
public class Brand {
    private String brandCode;
    private String brandNameCn;
    private String brandNameEng;
    private Integer brandSort;

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn;
    }

    public String getBrandNameEng() {
        return brandNameEng;
    }

    public void setBrandNameEng(String brandNameEng) {
        this.brandNameEng = brandNameEng;
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }
}
