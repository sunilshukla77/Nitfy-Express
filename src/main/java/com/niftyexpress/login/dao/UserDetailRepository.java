package com.niftyexpress.login.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.niftyexpress.entity.UserEntity;

//import com.bhartiy.login.entity.UserEntity;

@Repository
public interface UserDetailRepository extends MongoRepository<UserEntity, String> {
    //public UserEntity findByFirstName(String FirstName);
    public UserEntity findByUserEmailAndPassword(String userEmail, String password);
  
}