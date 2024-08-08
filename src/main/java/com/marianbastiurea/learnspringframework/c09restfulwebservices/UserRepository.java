package com.marianbastiurea.learnspringframework.c09restfulwebservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}