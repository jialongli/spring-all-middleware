package com.ipman.springcloud.consul.ribbon.sample.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ipipman on 2020/12/29.
 *
 * @version V1.0
 * @Package com.ipman.springcloud.consul.ribbon.sample.config
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/12/29 10:54 下午
 */
//Ribbon更细力度的配置，可以针对不同服务设置Load Balance策略
@Configuration
public class XXProviderRibbonConfig {

    //BestAvailableRule策略用来选取最少并发量请求的服务器
    @Bean
    public IRule ribbonRule(){
        return new BestAvailableRule();
    }
}
