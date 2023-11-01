package me.shindonghyeok.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shindonghyeok.springbootdeveloper.domain.Article;

//dto - 계층끼리 데이터 교환하기 위해 사용하는 객체
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(){ // 추후 블로그 글 추가할 때 저장할 엔티티로 변환하는 용도로 사용됨
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
