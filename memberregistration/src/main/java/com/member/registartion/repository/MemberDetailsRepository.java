package com.member.registartion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.member.registartion.model.MemberDetails;

public interface MemberDetailsRepository extends MongoRepository<MemberDetails, Integer>{

}
