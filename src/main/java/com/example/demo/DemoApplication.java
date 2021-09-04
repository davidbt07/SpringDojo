package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	@SpringBootApplication
	@Import(SwaggerConfiguration.class)
	public class MicroserviceProductsApplication implements WebMvcConfigurer {

		public static void main(String[] args) {
			SpringApplication.run(MicroserviceProductsApplication.class, args);
		}

		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("swagger-ui.html")
					.addResourceLocations("classpath:/META-INF/resources/");
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
