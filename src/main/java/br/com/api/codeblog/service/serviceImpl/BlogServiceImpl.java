package br.com.api.codeblog.service.serviceImpl;

import br.com.api.codeblog.repository.BlogRepository;
import br.com.api.codeblog.model.Post;
import br.com.api.codeblog.service.BlogService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blog, BlogRepository blogRepository){
        this.blogRepository = blog;
    }

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll(sortByIdAsc());
    }

    @Override
    public Post findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "id");
    }
}
