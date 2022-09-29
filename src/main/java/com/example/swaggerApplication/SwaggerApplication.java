package com.example.swaggerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
	@Bean
	   public Docket api() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.example.swaggerApplication")).build();
//	     
	      return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
					.apiInfo(apiInfo()).select().build();
		}

	

//	 private ApiInfo apiInfo() {
//			return new ApiInfo("Iconic Worker APIs", "API for Iconic Worker", "1.0", "1", null, "", "",
//					Collections.emptyList());
//		}

		private ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("Book Service")
					.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
					.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
					.license("Java_Gyan_Mantra License")
					.licenseUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ").version("1.0").build();
		}

}


