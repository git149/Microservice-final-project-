package llb.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//SpringCloudConfig
////配置文件自动刷新
@RefreshScope
@RestController
@RequestMapping("/SystemConfig")
public class SystemConfig {

    @Value("${mysql-config.url}")
    private String word;

    //获取配置
    @RequestMapping("/value")
    @ResponseBody
    public String update() {
        return word;
    }

}
