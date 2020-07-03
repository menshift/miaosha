package com.men.miaosha.controller;

import com.men.miaosha.entity.MiaoshaUser;
import com.men.miaosha.service.GoodsService;
import com.men.miaosha.service.MiaoshaUserService;
import com.men.miaosha.service.RedisService;
import com.men.miaosha.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

@Controller
public class LoginController {
    private static final String salt = "1a2b3c4d";


    @Autowired
    private GoodsService goodsService;
    @Autowired
    private MiaoshaUserService miaoshaUserService;

    @Autowired
    RedisService redisService;

/*    @PostMapping("/session")
    public String login(@RequestParam("mobile") @NotNull Long id,
                        @RequestParam("password") @NotNull String password,
                        HttpSession session){

        MiaoshaUser miaoshaUser = miaoshaUserService.getById(id);
        if (miaoshaUser.getPassword().equals(MD5Util.formPassToDBPass(password,salt))){
            goodsService.getAll();
            session.setAttribute();
            return "goods_list";
        }


    }*/

}
