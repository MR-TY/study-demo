package com.example.demo.conf;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author tangyu
 * @date 2020-07-14 16:14
 */
public class FilterConfig implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
            System.out.printf(" filter init -----------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.printf(" start filter post -----------------");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.printf(" end filter post -----------------");
    }

    @Override
    public void destroy() {
        System.out.printf(" filter destroy -----------------");
    }
}
