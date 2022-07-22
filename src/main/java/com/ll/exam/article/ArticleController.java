package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    public void showList(Rq rq) {
        List<ArticleDto> articleDtos= new ArrayList<>();
        articleDtos.add(new ArticleDto(1,"hi1","hi1","hi1"));
        articleDtos.add(new ArticleDto(2,"hi2","hi2","hi2"));
        articleDtos.add(new ArticleDto(3,"hi3","hi3","hi3"));
        articleDtos.add(new ArticleDto(4,"hi4","hi4","hi4"));
        articleDtos.add(new ArticleDto(5,"hi5","hi5","hi5"));

        rq.setAttr("articles",articleDtos);
        rq.view("user/article/list");
    }
}
