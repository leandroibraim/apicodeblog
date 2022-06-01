package br.com.api.codeblog.repository;

import br.com.api.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Post, Long> {
}
