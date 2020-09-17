package sample.provider.bootstrap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Dubbo Registry Nacos Provider Bootstrap
 *
 * @see sample.provider.service.DefaultDemoService
 * @since 2.7.0
 */
@EnableAutoConfiguration
public class DubboRegistryNacosProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboRegistryNacosProviderBootstrap.class)
                .run(args);
    }
}
