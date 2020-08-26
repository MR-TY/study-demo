package com.example.demo.mapperdto;

import com.example.demo.dto.StormOrderMatchingDto;
import com.example.demo.entity.StormOrderMatching;

import java.util.List;

/**
 * @author tangyu
 * @date 2020-07-15 17:38
 */
public interface StormOrderMatchingMapperToDtos  {

    public List<StormOrderMatchingDto> toStormOrderMatchingListDtos(List<StormOrderMatching> stormOrderMatchings);
}
