package com.donvi.admin.controller;

import com.alibaba.fastjson.JSON;
import com.donvi.admin.entity.GoodsDetail;
import com.donvi.admin.service.GoodsOperateService;
import com.donvi.utils.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/12/28
 * @Version: 1.0
 */
@RequestMapping("/goodsOperate")
@RestController
public class GoodsOperateController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsOperateController.class);

    @Autowired
    private GoodsOperateService operateService;

    @PostMapping("/addGoodsDetail")
    public ServerResponse addGoodsDetail(@RequestBody GoodsDetail goodsDetail){
        logger.info("开始新增商品详情:{}", JSON.toJSONString(goodsDetail));
        try{
            operateService.addGoodsDetail(goodsDetail);
            logger.info("新增成功:{}", JSON.toJSONString(goodsDetail));
        }catch (Exception e){
            logger.error("新增商品详情异常",e);
            return ServerResponse.createByError();
        }
        return ServerResponse.createBySuccess();
    }

    @PostMapping("/getMaxDetailCode")
    public ServerResponse getMaxDetailCode(@RequestBody GoodsDetail goodsDetail){
        logger.info("开始查询最大商品编码:{}", JSON.toJSONString(goodsDetail));
        ServerResponse result;
        try{
            String maxDetailCode = operateService.getMaxDetailCode(goodsDetail);
            logger.info("查询成功，参数:{}, 结果:{}", goodsDetail, maxDetailCode);
            result = ServerResponse.createBySuccess(maxDetailCode);
        }catch (Exception e){
            logger.error("查询最大商品编码异常", e);
            result = ServerResponse.createByError();
        }
        return result;
    }

}
