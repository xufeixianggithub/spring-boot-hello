package com.surd.springboot128.dao;

import org.springframework.stereotype.Repository;

import com.surd.springboot128.entity.User;

@Repository
public interface UserDao {
      User findAll();
}