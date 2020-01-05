package com.donvi.admin.dao;

import com.donvi.admin.entity.GoodsDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
@Repository
public interface GoodsDetailDao {

    void addGoodsDetail(@Param("goodsDetail") GoodsDetail goodsDetail);

    String getMaxDetailCode(@Param("goodsDetail") GoodsDetail goodsDetail);
}
