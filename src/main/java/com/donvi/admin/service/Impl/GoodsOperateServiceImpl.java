package com.donvi.admin.service.Impl;

import com.donvi.admin.dao.GoodsDetailDao;
import com.donvi.admin.entity.GoodsDetail;
import com.donvi.admin.service.GoodsOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Donvi Yang on 2020/1/4.
 */
@Service
public class GoodsOperateServiceImpl implements GoodsOperateService {

    @Autowired
    private GoodsDetailDao goodsDetailDao;

    @Override
    @Transactional
    public void saveGoodsDetail(GoodsDetail goodsDetail) throws Exception{
        try{
            goodsDetailDao.saveGoodsDetail(goodsDetail);
        } catch (Exception e){
            throw e;
        }
    }

    @Override
    public String getMaxDetailCode(GoodsDetail goodsDetail) throws Exception{
        try{
            return goodsDetailDao.getMaxDetailCode(goodsDetail);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<GoodsDetail> searchGoodsDetail(GoodsDetail goodsDetail) throws Exception {
        try{
            return goodsDetailDao.searchGoodsDetail(goodsDetail);
        }catch (Exception e){
            throw e;
        }
    }

}
