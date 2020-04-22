package com.atguigu.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    //记录器
   Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
       //日志级别trace<debug<info<warn<error
        //调整日志输出级别，日志在这个级别以后的高级别生效
        logger.trace("trace日志。。。");
        logger.debug("debug日志。。。");
        //SB 默认调整info
        logger.info("info日志。。。");
        logger.warn("warn日志。。。");
        logger.error("error日志。。。");


    }

}
