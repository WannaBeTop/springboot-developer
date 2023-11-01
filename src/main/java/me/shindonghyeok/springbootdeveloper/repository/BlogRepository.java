package me.shindonghyeok.springbootdeveloper.repository;

import me.shindonghyeok.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {  // 엔터티 article 과 pk타입 long을 인수로
}
