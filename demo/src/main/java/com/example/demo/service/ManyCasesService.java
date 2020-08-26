package com.example.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tangyu
 * @date 2020-08-20 9:11
 */
@Service
@Transactional
public class ManyCasesService {

    private static int num = 0;

    public void test1(){
        System.out.printf("num:------------------------------"+ (++num)+"--------------------");
    }

    public void test2(){
        System.out.printf("num:------------------------------"+ (++num)+"--------------------");
    }
}
