package com.avisos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;*/


@SpringBootApplication
/*@OpenAPIDefinition(info = @Info(title = "UBASA", description = "API do projeto do sistema de cadastro e informações da Unidade de Saúde Básica Animal.") )*/
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
