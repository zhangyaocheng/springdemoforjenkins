package com.zyc.springtest.demo.service;

import com.zyc.springtest.demo.mapper.UserInfoMapper;
import com.zyc.springtest.demo.pojo.Msg;
import com.zyc.springtest.demo.pojo.UserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * 获取所有用户信息
     * @return
     */
    public Msg findAllUserInfo(){

        Msg result = new Msg();
        result.setOk(false);
        result.setData(null);
        result.setStatus("500");

        try {

            List<UserInfo> list = userInfoMapper.findAll();
            result.setData(list);
            result.setStatus("200");
            result.setOk(true);

        }catch (Exception e){
            result.setExceptMessage("获取所有用户信息异常");
            e.printStackTrace();
        }

        return result;
    }

    public Msg findUserInfoByParametere(Map map){

        Msg result = new Msg();
        result.setOk(false);
        result.setStatus("500");
        result.setData(null);

        try {

            List<UserInfo> list = userInfoMapper.findByParameter(map);
            result.setData(list);
            result.setStatus("200");
            result.setOk(true);

        }catch (Exception e){
            result.setExceptMessage("通过参数获取用户信息异常");
            e.printStackTrace();
        }

        return result;
    }


}
