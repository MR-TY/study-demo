package com.example.demo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StormOrderMatchingDto {

    private String blNo;

    private String erChehngBlNo;

    private String loadSplitPackPoint;

    private String loadSplitPackPort;

    private String number;

    private BigDecimal payedCost;

    private BigDecimal pointToPortDistance;

    private String sizeType;

    private Long truckOrderTontainerId;

}