package com.example.demo.controller;

import com.example.demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyu
 * @date 2020-08-26 14:28
 */
@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/testAsync")
    public void testScope() {
        for (int i = 0; i < 10; i++) {
            asyncService.testReg();
        }
    }

    @RequestMapping("/testAsync1")
    public void testScope1() {
        asyncService.register1();
    }
}
