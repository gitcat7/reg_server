package com.sz.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@MapperScan("com.sz.p2p.dao")
public class RegServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegServerApplication.class, args);
	}

}
