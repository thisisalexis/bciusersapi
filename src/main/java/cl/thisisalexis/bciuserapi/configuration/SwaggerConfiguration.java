package cl.thisisalexis.bciuserapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Configuration file for Swagger and SwaggerUi automatic documentation
 *
 * @author Alexis Bravo
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cl.thisisalexis.bciuserapi.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "BCI USER API",
                "A challenge to develop an user API for the BCI.",
                "1.0.0",
                "Terms of service",
                new Contact("Alexis Bravo", "thisisalexis.herokuapp.com", "alexis.ve@gmail.com"),
                "Apache License 2.0", "API license URL", Collections.emptyList());
    }

}

