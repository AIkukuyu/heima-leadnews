package com.heima.wemedia.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 给使用feign远程调用的服务添加配置类，用于扫描降级服务所在的包
 */
@Configuration
@ComponentScan("com.heima.apis.article.fallback")
public class InitConfig {
}
