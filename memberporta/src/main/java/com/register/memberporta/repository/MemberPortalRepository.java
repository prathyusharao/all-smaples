package com.register.memberporta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.register.memberporta.model.MemberDetails;

@Repository
public interface MemberPortalRepository extends MongoRepository < MemberDetails, Long > {

}


