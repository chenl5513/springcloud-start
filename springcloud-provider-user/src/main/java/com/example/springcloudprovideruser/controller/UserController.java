package com.example.springcloudprovideruser.controller;

import com.example.springcloudprovideruser.entity.User;
import com.example.springcloudprovideruser.repo.UserPepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: UserController
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
public class UserController {

	@Autowired
	private UserPepository userPepository;

	@GetMapping("/{id}")
	private User findById(@PathVariable Long id){

		User user = userPepository.findOne(id);

		return user;
	}
}
