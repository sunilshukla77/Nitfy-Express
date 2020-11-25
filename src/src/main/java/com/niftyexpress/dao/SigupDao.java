package com.niftyexpress.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.niftyexpress.entity.UserEntity;

@Repository
public class SigupDao {
	@Autowired
	MongoTemplate mongoTemplate;

	public UserEntity saveUserDetail(UserEntity ue) {
		return mongoTemplate.save(ue);
	}

}
