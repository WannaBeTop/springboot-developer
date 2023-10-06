package me.shindonghyeok.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.shindonghyeok.springbootdeveloper.domain.Article;
import me.shindonghyeok.springbootdeveloper.dto.AddArticleRequest;
import me.shindonghyeok.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
