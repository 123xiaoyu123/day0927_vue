package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = {""})可为空 两种写法 下面的也是
@MapperScan("com.baidu.mapper")
public class Day0915Springboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(Day0915Springboot3Application.class, args);
    }

}
