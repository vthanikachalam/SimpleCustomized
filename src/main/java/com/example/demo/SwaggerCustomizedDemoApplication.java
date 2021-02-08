package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SwaggerCustomizedDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerCustomizedDemoApplication.class, args);
    }

    @Value("${server.address}")
    private String serverAddress;

    @Value("${server.port}")
    private String serverPort;

    @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .paths(PathSelectors.ant("/api/*"))
                    .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                    .build()
                    .host(serverAddress+":"+serverPort)
                    .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Address Book API",
                "Simple API for demo purpose",
                "1.0",
                "http://apache.org",
                new springfox.documentation.service.Contact("Thanikachalam V", "https://altais.com", "Thanikachalam.Varadarajan@altais.com"),
                "API License",
                "http://apache.org",
                Collections.emptyList());
    }

}
