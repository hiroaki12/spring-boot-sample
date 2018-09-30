package com.example.multidbinstance.mapper.db2;

import org.apache.ibatis.annotations.Mapper;

import com.example.multidbinstance.entity.User;

@Mapper
public interface UserMapper2 {
	
	void save(User users);
	
}
