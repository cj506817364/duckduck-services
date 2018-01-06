package top.duckduck.module.user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "top.duckduck.module.*.*")
@EnableJpaRepositories(basePackages = "top.duckduck.module.*.dao")
@EntityScan("top.duckduck.module.*.*")
public class Application implements EmbeddedServletContainerCustomizer{
	
    /**
     * entrance of boot startup 
     * @param args
     */
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
    }

    /**
     * 通知实现EmbeddedServletContainerCustomizer的customize方法
     * 对内置tomcat进行配置
     */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		//配置端口号
		container.setPort(7071);
	}

}
