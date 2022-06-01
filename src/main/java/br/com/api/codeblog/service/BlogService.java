package br.com.api.codeblog.service;

import br.com.api.codeblog.model.Post;

import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
