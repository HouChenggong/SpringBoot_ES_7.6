package cn.vector.esdemo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author xiyouyan
 */
@Data
@Document(indexName = "article")
public class Article implements Serializable{


    private static final long serialVersionUID = 5769818885365494520L;
    @Id
    private Integer id;
    private String title;
    private String content;
    private String summary;
    private int pv;
    private String author;
}
