package com.example.demo.conf;

import com.example.demo.conf.pluging.SensitivePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tangyu
 * @date 2020-08-14 13:50
 */
@Configuration
public class SensitivePluginConfig {

    @Bean
    public SensitivePlugin sensitivePlugin() {
        SensitivePlugin sensitivePlugin = new SensitivePlugin();
        return sensitivePlugin;
    }
}
