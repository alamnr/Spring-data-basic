package com.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
