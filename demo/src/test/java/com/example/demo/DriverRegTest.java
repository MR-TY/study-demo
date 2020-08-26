package com.example.demo;

import com.example.demo.entity.DriverRegistration;
import com.example.demo.mapper.DriverRegistrationMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tangyu
 * @date 2020-08-14 13:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverRegTest {

    @Autowired
    private DriverRegistrationMapper driverRegistrationMapper;

    @Test
    public void test1(){
        DriverRegistration driverRegistration = driverRegistrationMapper.selectById(2);
        System.out.printf("司机名字："+driverRegistration.getDriverName());
    }
}
