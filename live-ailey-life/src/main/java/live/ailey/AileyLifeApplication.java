package live.ailey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 让注册中心发现并扫描该服务
public class AileyLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AileyLifeApplication.class, args);
    }
}
