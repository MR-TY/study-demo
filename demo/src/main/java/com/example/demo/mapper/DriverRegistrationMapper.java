package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.DriverRegistration;
import com.example.demo.entity.StormOrderMatching;

import java.util.List;

public interface DriverRegistrationMapper extends BaseMapper<DriverRegistration> {
    int deleteByPrimaryKey(Long id);

    int insert(DriverRegistration record);

    DriverRegistration selectByPrimaryKey(Long id);

    List<DriverRegistration> selectAll();

    int updateByPrimaryKey(DriverRegistration record);
}