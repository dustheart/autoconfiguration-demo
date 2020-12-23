package com.gupaoedu.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisOperations;

@ConditionalOnClass({RedisOperations.class})
@Configuration
public class GupaoConfiguration {

	@Bean
	public GupaoEduCore gupaoEduCore(){
		return new GupaoEduCore();
	}

}
