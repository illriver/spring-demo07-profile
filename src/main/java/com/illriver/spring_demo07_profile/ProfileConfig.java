package com.illriver.spring_demo07_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 配置类
 * @author Pactera
 *
 */
@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}
	@Bean
	@Profile("prod")
	public DemoBean proDemoBean() {
		return new DemoBean("from production profile");
	}

}
