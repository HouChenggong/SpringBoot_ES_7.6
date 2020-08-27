package cn.vector.esdemo.controller;


import cn.vector.esdemo.entity.Article;
import cn.vector.esdemo.repository.ArticleEsRepository;
import cn.vector.esdemo.response.ServerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author xiyouyan
 */
@Api("es")
@RestController
public class ElasticSearchController {

    @Autowired
    private ArticleEsRepository articleEsRepository;


    @GetMapping("insert")
    @ApiOperation(value = "insert）", notes = "insert")
    public ServerResponse insert(Integer id) {
        Article article = new Article();
        article.setAuthor("Alice");
        article.setContent("spring boot data es");
        article.setId((id));
        article.setPv(100);
        article.setSummary("spring boot es");
        article = articleEsRepository.save(article);
        return ServerResponse.createBySuccess(article);
    }

    @GetMapping("queryById")
    public ServerResponse queryForTitle(Integer id) {
        Optional article = articleEsRepository.findById(id);
        return ServerResponse.createBySuccess(article.orElse("不存在"));
    }

}
