package com.example.demo.conf;

import com.example.demo.conf.intercept.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author tangyu
 * @date 2020-07-22 16:00
 */
@Configuration
public class InterceptWebConfig implements WebMvcConfigurer {

    private static String[] url = {"/user/add", "/swagger-ui.html/**"
            , "/swagger-resources/**", "/webjars/springfox-swagger-ui/**"
            , "/swagger-ui/**", "/v3/","/v3/**"};

    @Bean
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**").excludePathPatterns(url);
    }
}
