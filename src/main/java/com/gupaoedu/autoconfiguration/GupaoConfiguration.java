package com.gupaoedu.autoconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GupaoConfiguration {

	@Bean
	public GupaoEduCore gupaoEduCore(){
		return new GupaoEduCore();
	}

}
