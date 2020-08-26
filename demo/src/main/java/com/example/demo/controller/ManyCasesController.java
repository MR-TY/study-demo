package com.example.demo.controller;

import com.example.demo.service.ManyCasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyu
 * @date 2020-08-19 17:42
 */
@RestController
@RequestMapping("/user")
public class ManyCasesController {

    @Autowired
    private ManyCasesService manyCasesService;

    @RequestMapping("/testScope")
    public void testScope() {
        manyCasesService.test1();
    }

    @RequestMapping("/testScope2")
    public void testScope2() {
        manyCasesService.test2();
    }
}
