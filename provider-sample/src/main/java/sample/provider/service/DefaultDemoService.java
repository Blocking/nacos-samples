package sample.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import sample.common.DemoService;


/**
 * Default {@link DemoService}
 *
 * @author zhangxiaoyu
 * @see DemoService
 * @since 2.7.0
 */
@DubboService(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
