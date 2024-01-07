package llb.system.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplateGateway() {
        return new RestTemplate();
    }

    @Bean
    @LoadBalanced //@LoadBalanced的注解，表示需要做负载匀衡
    @Primary
    public RestTemplate restTemplateLoadBalanced(){
        return new RestTemplate();
    }

}
