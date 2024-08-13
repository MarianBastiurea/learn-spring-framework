package com.marianbastiurea.learnspringframework.c09restfulwebservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}