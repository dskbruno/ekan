package br.com.dskbruno.ekan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("br.com.dskbruno.ekan")
//@OpenAPIDefinition(info = @Info(title = "Beneficiarios API", version = "1.0", description = "Beneficiarios Information"))
//@SecurityScheme(name = "javainuseapi", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class EkanApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkanApplication.class, args);
	}

}
