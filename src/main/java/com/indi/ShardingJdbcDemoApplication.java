package com.indi;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://shardingsphere.apache.org/index.html
 * https://shardingsphere.apache.org/document/legacy/4.x/document/en/manual/sharding-jdbc/
 * http://shardingsphere.apache.org/index_zh.html
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class ShardingJdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDemoApplication.class, args);
    }


}
