package com.donvi.admin.entity;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
public class Goods {
    private String goodsCode;
    private String goodsNameCn;
    private String goodsNameEng;
    private Integer goodsSort;

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsNameCn() {
        return goodsNameCn;
    }

    public void setGoodsNameCn(String goodsNameCn) {
        this.goodsNameCn = goodsNameCn;
    }

    public String getGoodsNameEng() {
        return goodsNameEng;
    }

    public void setGoodsNameEng(String goodsNameEng) {
        this.goodsNameEng = goodsNameEng;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }
}
