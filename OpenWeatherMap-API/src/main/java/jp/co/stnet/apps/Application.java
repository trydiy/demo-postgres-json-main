package jp.co.stnet.apps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.stnet.apps.domain.repository")
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
