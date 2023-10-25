package br.com.ulbra.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}
	@RequestMapping("/inicio")
	@GetMapping
	public String inicio(){

		return "Tiago, Rosana, Carol";
	}

}
