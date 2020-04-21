package com.guigu.springboot.config;

import com.guigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration这是一个配置类，替代之前的配置文件
 * 配置文件用<Bean><Bean/>添加组件
 */
@Configuration
public class MyAppConfig {
    @Bean
    //将方法的返回值添加到容器中，这个组件默认id为方法名
    public HelloService helloService2() {
        System.out.println("配置类@Bean给容器添加组件了");
    return new HelloService();
    }
    }
