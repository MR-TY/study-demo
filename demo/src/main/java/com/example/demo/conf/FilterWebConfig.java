package com.example.demo.conf;

import org.assertj.core.util.Lists;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tangyu
 * @date 2020-07-14 16:16
 */
@Configuration
public class FilterWebConfig {

    @Bean
    public FilterRegistrationBean<FilterConfig> actuatorSecurityIpFilterRegistrationBean() {
        FilterRegistrationBean<FilterConfig> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new FilterConfig());
        filterRegistrationBean.setUrlPatterns(Lists.newArrayList("/*"));
        return filterRegistrationBean;
    }
}
