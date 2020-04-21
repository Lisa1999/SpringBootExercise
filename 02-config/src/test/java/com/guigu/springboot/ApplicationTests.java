package com.guigu.springboot;

import com.guigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.ApplicationContext;
/**
 *
 * SB单元测试 类似编码一样进行自动注入容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService2");
        System.out.println(b);

    }
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
