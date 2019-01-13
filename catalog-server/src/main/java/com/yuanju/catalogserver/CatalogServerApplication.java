package com.yuanju.catalogserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 15:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CatalogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServerApplication.class, args);
    }
}
