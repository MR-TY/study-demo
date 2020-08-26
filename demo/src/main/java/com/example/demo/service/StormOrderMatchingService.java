package com.example.demo.service;

import com.example.demo.entity.StormOrderMatching;
import com.example.demo.mapper.StormOrderMatchingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tangyu
 * @date 2020-07-29 9:16
 */
@Service
public class StormOrderMatchingService {

    @Autowired
    private StormOrderMatchingMapper stormOrderMatchingMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void testUpdate00() {
        testUpdate1();
    }

    public void testUpdate() {
        try {
            testUpdate1();
        } catch (Exception e) {
            e.printStackTrace();
            // testUpdate2();
            // 手动回滚事件
            // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }

    public void testUpdate0() {
        try {
            testUpdate1();
        } catch (Exception e) {
            testUpdate2();
        }
    }

    //@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void testUpdate1() {
        StormOrderMatching stormOrderMatching = new StormOrderMatching();
        stormOrderMatching.setId(2L);
        stormOrderMatching.setPointToPortDistance(new BigDecimal(222));
        stormOrderMatchingMapper.updateById(stormOrderMatching);
        int i = 1 / 0;
    }

    public void castStorm(StormOrderMatching stormOrderMatching) {
        stormOrderMatching.setId(2L);
        stormOrderMatching.setPointToPortDistance(new BigDecimal(3333));
        stormOrderMatchingMapper.updateById(stormOrderMatching);
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void testUpdate2() {
        StormOrderMatching stormOrderMatching = new StormOrderMatching();
        stormOrderMatching.setId(4L);
        stormOrderMatching.setBlNo("3333");
        stormOrderMatchingMapper.updateById(stormOrderMatching);
        int i = 1 / 0;
    }

    public static void main(String args[]) {
        String str = "13262798888";
        String pattern = "0?(13|14|15|18|17)[0-9]{9}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
