package com.heima.wemedia.config;


import com.heima.wemedia.interceptor.WmTokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 添加自定义的拦截器
     * @param registry 注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有请求
        registry.addInterceptor(new WmTokenInterceptor()).addPathPatterns("/**");
    }
}
