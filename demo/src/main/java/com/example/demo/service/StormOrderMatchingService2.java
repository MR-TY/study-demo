package com.example.demo.service;

import com.example.demo.mapper.StormOrderMatchingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tangyu
 * @date 2020-07-29 10:27
 */
@Service
public class StormOrderMatchingService2 {

    @Autowired
    private StormOrderMatchingService stormOrderMatchingService;

    public void testUpdate() {
        stormOrderMatchingService.testUpdate();
    }

    public void testUpdate1() {
        try {
            stormOrderMatchingService.testUpdate1();
        } catch (Exception e) {
            stormOrderMatchingService.testUpdate2();
        }
    }

    public void testUpdate2() {
        try {
            stormOrderMatchingService.testUpdate1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
