package cn.stylefeng.guns;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

/**
 * SpringBoot方式启动类
 *
 * @author fengshuonan
 * @since 2020/12/1 17:50
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"cn.stylefeng"}, exclude = {FlywayAutoConfiguration.class})
public class ProjectStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectStartApplication.class, args);
        log.info(ProjectStartApplication.class.getSimpleName() + " is success!");
    }

}

