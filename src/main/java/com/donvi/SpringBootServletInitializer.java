package com.donvi;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/11/10
 * @Version: 1.0
 */
@Configuration
public class SpringBootServletInitializer extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BagworldApplication.class);
    }
}