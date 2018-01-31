package com.example.springcloudsimpleconsumermovie.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Title: Config
 * Description: 请更改这里的描述
 * <p>
 * Copyright: Copyright (c) 悦升信息
 * Company: 济南悦升信息技术有限公司
 *
 * @author create 陈雷 2018/1/30
 * @version 1.0
 * @since 1.0
 */
@Configuration
public class Config {

	@Bean
	public RestTemplate restTemplate(){

		return new RestTemplate();

	}
}
