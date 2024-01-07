package llb.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//配置中心（Config）
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class Llb_SystemConfig {
    public static void main(String[] args) {
        SpringApplication.run(Llb_SystemConfig.class, args);
        System.out.println("配置中心启动成功~");
    }
}
