package com.example.springcloudsimpleconsumermovie.controller;

import com.example.springcloudsimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Title: MovieController
 * Description: 请更改这里的描述
 * <p>
 * Copyright: Copyright (c) 悦升信息
 * Company: 济南悦升信息技术有限公司
 *
 * @author create 陈雷 2018/1/30
 * @version 1.0
 * @since 1.0
 */
@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id){

		return  restTemplate.getForObject("http://localhost:8080/"+id,User.class);

	}
}
