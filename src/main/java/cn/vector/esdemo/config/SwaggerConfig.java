package cn.vector.esdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xiyouyan
 * Swagger的访问路径由
 * port/swagger-ui.html改成了port/swagger-ui/ 或port/swagger-ui/index.html
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档标题(API名称)
                .title("xiyou")
                //文档描述
                .description("ES 服务接口")
                //URL
                .termsOfServiceUrl("http://127.0.0.1:8080/")
                //版本号
                .version("1.0.0")
                .build();
    }


    @Bean("全局")
    //当然你要是不想一个一个的设置最简单的是设置一个全局模块，拦截所有的路由
    public Docket quanJuApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("全局")
                //下面的paths设置该模块拦截的路由
                .pathMapping("/")
                .select()
                .build()
                .apiInfo(apiInfo())
                ;
    }


}
