package com.example.readerserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.example.readerserver.mapper")// 扫描 mapper目录下的映射接口
public class ReaderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderServerApplication.class, args);
    }



}



