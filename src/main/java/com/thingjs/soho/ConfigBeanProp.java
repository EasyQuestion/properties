package com.thingjs.soho;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author mumh@2423528736@qq.com
 * @date 2019/10/16 10:30
 */
@Data
@Component
@PropertySource("conf.properties")
@ConfigurationProperties(prefix = "demo")
public class ConfigBeanProp {
    private String phone;
    private String wife;
}
