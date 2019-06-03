package com.xinruke.user.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration 让Spring加载该类配置
 * @EnableSwagger2 启用Swagger2
 */
@Profile({"dev", "test"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("用户模块")
                .select()
                // 这里是全局扫描有@Api注解得类，还可以扫描任意位置，指定包以及针对方法上的指定注解
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Spring Boot中使用Swagger2构建RESTful APIs");
        apiInfoBuilder.description("description");
        apiInfoBuilder.termsOfServiceUrl("termsOfServiceUrl");
        apiInfoBuilder.contact("contact");
        apiInfoBuilder.version("1.0.0");
        return new ApiInfoBuilder().build();
    }
}
