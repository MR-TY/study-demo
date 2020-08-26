package com.example.demo.controller;
import com.example.demo.service.StormOrderMatchingService;
import com.example.demo.service.StormOrderMatchingService2;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tangyu
 * @date 2020-07-14 16:19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private StormOrderMatchingService stormOrderMatchingService;

    @Autowired
    private StormOrderMatchingService2 stormOrderMatchingService2;

    @GetMapping("add")
    public String add() {
        System.out.printf("hello world-----------------");
        return "hello world";
    }

    @PostMapping("update")
    public String update() {
        stormOrderMatchingService.testUpdate();
        return "success";
    }

    @PostMapping("update1")
    public String update1() {
        stormOrderMatchingService.testUpdate1();
        return "success";
    }

    @RequestMapping(value = "update11", method = RequestMethod.POST)
    public String update2() {
        stormOrderMatchingService.testUpdate1();
        return "success";
    }
}
