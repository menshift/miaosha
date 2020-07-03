package com.men.miaosha.service.impl;

import com.men.miaosha.dao.MiaoshaUserDao;
import com.men.miaosha.entity.MiaoshaUser;
import com.men.miaosha.service.MiaoshaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MiaoshaUserServiceImpl implements MiaoshaUserService{

    @Autowired
    private MiaoshaUserDao miaoshaUserDao;

    @Override
    public MiaoshaUser getById(Long id) {
        MiaoshaUser miaoshaUser = miaoshaUserDao.selectByPrimaryKey(id);
        return miaoshaUser;
    }
}
