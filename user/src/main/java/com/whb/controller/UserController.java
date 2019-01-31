package com.whb.controller;


import com.whb.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    private static final String URL="http://SERVER-POWER";

    @RequestMapping("/getUser.do")
    public R getUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","user");
        return R.success("返回成功",map);
    }


    @RequestMapping("/getPower.do")
    public R getPower(){
        return R.success("操作成功",restTemplate.getForObject(URL+"/getPower.do",Object.class));
    }

}
