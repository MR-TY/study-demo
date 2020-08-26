package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tangyu
 * @date 2020-07-16 16:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;


    @Async
    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom(sender);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        try {
            javaMailSender.send(mailMessage);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("发送简单邮件失败");
        }

    }
}
