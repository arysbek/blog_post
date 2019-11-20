package com.blog.models.repository;

import com.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByAuthor(String fullName);

}
