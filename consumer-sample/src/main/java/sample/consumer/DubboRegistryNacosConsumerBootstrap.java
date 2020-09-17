package sample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import sample.common.DemoService;
import sample.common.SampleService;

/**
 * Dubbo Registry Nacos Consumer Bootstrap
 */
@Slf4j
@EnableAutoConfiguration
public class DubboRegistryNacosConsumerBootstrap {


    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;
    @DubboReference(version = "${demo.service.version}")
    private SampleService sampleService;

    public static void main(String[] args) {
        SpringApplication.run(DubboRegistryNacosConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> log.info(demoService.sayHello("mercyblitz"));
    }
}
