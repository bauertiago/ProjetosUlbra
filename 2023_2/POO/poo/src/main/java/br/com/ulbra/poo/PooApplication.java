package br.com.ulbra.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;


@SpringBootApplication
@RestController
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}
	@RequestMapping("/inicio")
	@GetMapping
	public List<String> inicio(@RequestParam(value = "name", defaultValue = "")String name){
		final List<String> nomes = new ArrayList<>();
		nomes.add("Tiago");
		nomes.add("Rosana");
		nomes.add("Laura");
		nomes.add("Carol");
		nomes.add("Daniel");
		return nomes;
	}

}
