package com.member.register.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.member.register.entity.MemberDetails;

@Repository
public interface MemberRegisterRepository extends MongoRepository < MemberDetails, Long > {
}
