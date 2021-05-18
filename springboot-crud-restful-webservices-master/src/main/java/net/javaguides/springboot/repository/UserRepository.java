package net.javaguides.springboot.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
