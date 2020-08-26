package com.example.demo;

import com.example.demo.dto.StormOrderMatchingDto;
import com.example.demo.entity.StormOrderMatching;
import com.example.demo.mapper.StormOrderMatchingMapper;
import com.example.demo.mapperdto.mapperdtoiml.StormOrderMatchingMapperToDtoIml;
import com.example.demo.service.StormOrderMatchingService;
import com.example.demo.service.StormOrderMatchingService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tangyu
 * @date 2020-07-15 14:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StormOrderMatchingTest {

    private static Logger logger = LoggerFactory.getLogger(StormOrderMatchingTest.class);

    @Autowired
    private StormOrderMatchingMapper stormOrderMatchingMapper;

    @Autowired
    private StormOrderMatchingService stormOrderMatchingService;

    @Autowired
    private StormOrderMatchingService2 stormOrderMatchingService2;

    @Autowired
    private StormOrderMatchingMapperToDtoIml stormOrderMatchingMapperToDto;

    @Test
    public void testStormOrderMatching(){
        List<StormOrderMatching> stormOrderMatchings = stormOrderMatchingMapper.selectAll();

        long start =  System.currentTimeMillis();
        List<StormOrderMatchingDto> stormOrderMatchingDtos = stormOrderMatchingMapperToDto.toStormOrderMatchingListDtos(stormOrderMatchings);
        long end =  System.currentTimeMillis();
        System.out.printf("mapstruct time: "+(end-start));

        logger.info("mapstruct time: "+(end-start));
        long start1 =  System.currentTimeMillis();
        List<StormOrderMatchingDto> stormOrderMatchingDtos1 = stormOrderMatchings.stream().map(c -> castToDto(c)).collect(Collectors.toList());
        long end1 =  System.currentTimeMillis();
        System.out.printf("java8 time: "+(end1-start1));
        logger.info("java8 time: "+(end1-start1));

        long start2 =  System.currentTimeMillis();
        List<StormOrderMatchingDto> stormOrderMatchingDtos2 = new ArrayList<>();
        stormOrderMatchings.stream().forEach(c -> copyStormOrderMatching(c,stormOrderMatchingDtos2));
        long end2 =  System.currentTimeMillis();
        logger.info("BeanUtils time: "+(end2-start2));
        System.out.printf("success");
    }

    private void copyStormOrderMatching(StormOrderMatching c, List<StormOrderMatchingDto> stormOrderMatchingDtos2) {
        StormOrderMatchingDto dto = new StormOrderMatchingDto();
        BeanUtils.copyProperties(c,dto);
        stormOrderMatchingDtos2.add(dto);
    }

    private StormOrderMatchingDto castToDto(StormOrderMatching c) {
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
        return dto;
    }

    @Test
    public void testUpdate(){
        stormOrderMatchingService2.testUpdate();
    }

    @Test
    public void testUpdate1(){
        stormOrderMatchingService.testUpdate1();
    }

    @Test
    public void testUpdate2(){
        stormOrderMatchingService2.testUpdate1();
    }

    @Test
    public void testUpdate3(){
        stormOrderMatchingService.testUpdate();
    }

    @Test
    public void testUpdate4(){
        stormOrderMatchingService2.testUpdate2();
    }

    @Test
    public void testUpdate5(){
        stormOrderMatchingService.testUpdate0();
    }

    @Test
    public void testUpdate6(){
        stormOrderMatchingService.testUpdate00();
    }

}
