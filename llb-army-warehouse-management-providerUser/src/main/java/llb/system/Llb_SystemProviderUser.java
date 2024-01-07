package llb.system;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//服务（User）
@EnableEurekaClient
@SpringBootApplication
@MapperScan("llb.system.dao")
public class Llb_SystemProviderUser {
    public static void main(String[] args) {
        SpringApplication.run(Llb_SystemProviderUser.class, args);
    }
}
