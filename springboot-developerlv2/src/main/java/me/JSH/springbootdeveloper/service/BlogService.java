package me.JSH.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.JSH.springbootdeveloper.domain.Article;
import me.JSH.springbootdeveloper.dto.AddArticleRequest;
import me.JSH.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private  final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
