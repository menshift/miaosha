package com.men.miaosha.service.impl;

import com.men.miaosha.dao.GoodsDao;
import com.men.miaosha.entity.Goods;
import com.men.miaosha.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods selectByPrimaryKey(Long id) {
        Goods goods = goodsDao.selectByPrimaryKey(id);
        return goods;
    }
}
