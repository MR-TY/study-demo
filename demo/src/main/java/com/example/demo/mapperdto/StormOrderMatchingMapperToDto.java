package com.example.demo.mapperdto;

import com.example.demo.dto.StormOrderMatchingDto;
import com.example.demo.entity.StormOrderMatching;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StormOrderMatchingMapperToDto extends StormOrderMatchingMapperToDtos  {

    @Mappings({
            @Mapping(source = "stormOrderMatching.blNo",target = "blNo"),
            @Mapping(source = "stormOrderMatching.erChehngBlNo",target = "erChehngBlNo"),
            @Mapping(source = "stormOrderMatching.loadSplitPackPoint",target = "loadSplitPackPoint"),
            @Mapping(source = "stormOrderMatching.number",target = "number"),
            @Mapping(source = "stormOrderMatching.payedCost",target = "payedCost"),
            @Mapping(source = "stormOrderMatching.pointToPortDistance",target = "pointToPortDistance"),
            @Mapping(source = "stormOrderMatching.sizeType",target = "sizeType"),
            @Mapping(source = "stormOrderMatching.truckOrderTontainerId",target = "truckOrderTontainerId")
    })
    public StormOrderMatchingDto toStormOrderMatchingDto(StormOrderMatching stormOrderMatching);


}