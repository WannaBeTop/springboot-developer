package me.shindonghyeok.springbootdeveloper.repository;

import me.shindonghyeok.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
