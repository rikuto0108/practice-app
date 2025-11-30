package com.reservation.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.reservation.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
	
	 Optional<UserInfo> getUser (String userId);
	 
}
