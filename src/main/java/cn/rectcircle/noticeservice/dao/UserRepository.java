package cn.rectcircle.noticeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.rectcircle.noticeservice.entity.User;

/**
 * Copyright (c) 2018, rectcircle. All rights reserved.
 *
 * @author rectcircle
 * @date 2018-06-06
 * @version 0.0.1
 */
public interface UserRepository extends JpaRepository<User, Long>  {
	
}