package life.ailey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 让注册中心发现并扫描该服务
@MapperScan(basePackages = {"life.ailey.mapper"})
public class AileyLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AileyLifeApplication.class, args);
    }
}
