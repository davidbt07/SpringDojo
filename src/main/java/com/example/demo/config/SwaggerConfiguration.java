package com.example.demo.config;

public class SwaggerConfiguration {
    @Configuration
    @EnableSwagger2
    public class SwaggerConfiguration {
        @Bean
        public Docket productApi(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}
