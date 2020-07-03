package com.men.miaosha.service;

import com.men.miaosha.entity.Goods;
import org.springframework.stereotype.Service;

public interface GoodsService {

    public Goods selectByPrimaryKey(Long id);
}
