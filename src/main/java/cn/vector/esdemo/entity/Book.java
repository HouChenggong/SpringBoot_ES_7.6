package cn.vector.esdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * @author xiyouyan
 */
@Document(indexName = "book")
@Data
@AllArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = -6735262946738993607L;
    @Id
    private Integer id;

    private String title;

    private BigDecimal price;

    @Field(type = FieldType.Keyword)
    private List<String> tag;


}
