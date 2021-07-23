package br.com.salvus.TesteSS;

import br.com.salvus.TesteSS.controller.UserController;
import br.com.salvus.TesteSS.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackageClasses={UserController.class , User.class})
@SpringBootApplication
public class TesteSsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSsApplication.class, args);
	}

}
