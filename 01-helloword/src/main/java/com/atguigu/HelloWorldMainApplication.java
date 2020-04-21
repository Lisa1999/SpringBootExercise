package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //Spring 应用启动
        //主程序传进来，可变参数传进来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
