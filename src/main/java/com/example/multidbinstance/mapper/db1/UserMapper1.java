package com.example.multidbinstance.mapper.db1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.multidbinstance.entity.User;

@Mapper
public interface UserMapper1 {

	List<User> findAll();
	
}
