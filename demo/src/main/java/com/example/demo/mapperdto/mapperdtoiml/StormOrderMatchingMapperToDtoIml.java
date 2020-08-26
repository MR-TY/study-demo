package com.example.demo.mapperdto.mapperdtoiml;

import com.example.demo.dto.StormOrderMatchingDto;
import com.example.demo.entity.StormOrderMatching;
import com.example.demo.mapperdto.StormOrderMatchingMapperToDto;
import com.example.demo.mapperdto.StormOrderMatchingMapperToDtos;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tangyu
 * @date 2020-07-15 17:28
 */
@Component
public class StormOrderMatchingMapperToDtoIml implements StormOrderMatchingMapperToDtos {

    @Override
    public List<StormOrderMatchingDto> toStormOrderMatchingListDtos(List<StormOrderMatching> stormOrderMatchings) {
        List<StormOrderMatchingDto> stormOrderMatchingDtoList = new ArrayList<>();
        stormOrderMatchings.stream().forEach(c -> {
            StormOrderMatchingDto dto = new StormOrderMatchingDto();
            dto.setBlNo(c.getBlNo());
            dto.setErChehngBlNo(c.getErChehngBlNo());
            dto.setLoadSplitPackPoint(c.getLoadSplitPackPoint());
            dto.setLoadSplitPackPort(c.getLoadSplitPackPort());
            dto.setNumber(c.getNumber());
            dto.setPayedCost(c.getPayedCost());
            dto.setPointToPortDistance(new BigDecimal(0));
            dto.setSizeType(c.getSizeType());
            dto.setTruckOrderTontainerId(c.getTruckOrderTontainerId());
            stormOrderMatchingDtoList.add(dto);
        });
        return stormOrderMatchingDtoList;
    }
}
