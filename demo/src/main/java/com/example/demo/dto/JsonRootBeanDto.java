package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangyu
 * @date 2020-07-28 13:56
 */
public class JsonRootBeanDto {

    private List<JsonDto> json1 = new ArrayList<>();

    public List<JsonDto> getJson1() {
        return json1;
    }

    public void setJson1(List<JsonDto> json1) {
        this.json1 = json1;
    }
}
