package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.StormOrderMatching;
import java.util.List;

public interface StormOrderMatchingMapper extends BaseMapper<StormOrderMatching> {
    int deleteByPrimaryKey(Long id);

    int insert(StormOrderMatching record);

    StormOrderMatching selectByPrimaryKey(Long id);

    List<StormOrderMatching> selectAll();

    int updateByPrimaryKey(StormOrderMatching record);
}