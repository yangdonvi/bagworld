package com.donvi.admin.dao;

import com.donvi.admin.entity.GoodsDetail;
import org.springframework.stereotype.Repository;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
@Repository
public interface GoodsDetailDao {

    void saveGoodsDetail(GoodsDetail goodsDetail);

    String getMaxDetailCode(GoodsDetail goodsDetail);
}
