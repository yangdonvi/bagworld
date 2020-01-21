package com.donvi.admin.service;

import com.donvi.admin.entity.GoodsDetail;
import com.donvi.utils.ServerResponse;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
public interface GoodsOperateService {

    void saveGoodsDetail(GoodsDetail goodsDetail) throws Exception;

    String getMaxDetailCode(GoodsDetail goodsDetail) throws Exception;
}
