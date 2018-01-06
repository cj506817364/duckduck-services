package top.duckduck.module.merchant.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "top.duckduck.module.*.*")
public class Application {
	
    /**
     * entrance of boot startup 
     * @param args
     */
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
    }


}
