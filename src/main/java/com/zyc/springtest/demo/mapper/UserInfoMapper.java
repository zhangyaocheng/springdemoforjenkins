package com.zyc.springtest.demo.mapper;

import com.zyc.springtest.demo.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserInfoMapper {

    List<UserInfo> findAll();

    List<UserInfo> findByParameter(Map map);



}
