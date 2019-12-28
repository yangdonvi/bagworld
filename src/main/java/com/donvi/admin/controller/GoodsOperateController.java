package com.donvi.admin.controller;

import com.alibaba.fastjson.JSON;
import com.donvi.utils.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/12/28
 * @Version: 1.0
 */
@RestController("/goodsOperate")
public class GoodsOperateController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsOperateController.class);

    @Autowired
    private GoodsOperateService operateService;

    @PostMapping("/addGoods")
    public ServerResponse addGoods(GoodsDetail goodsDetail){
        logger.info("开始新增商品详情:{}", JSON.toJSONString(goodsDetail));
        return operateService.addGoods(goodsDetail);
    }


}
