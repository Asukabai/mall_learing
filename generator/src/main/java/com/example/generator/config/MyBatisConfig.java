package com.example.generator.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description : MyBatis配置类
 */
@Configuration
@MapperScan({"com.example.generator.mbg.mapper","com.example.generator.dao"})
public class MyBatisConfig {

}
