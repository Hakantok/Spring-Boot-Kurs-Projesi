package com.project.Example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Example.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserId(Long userId);

}
