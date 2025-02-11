package eu.home.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping ("/")
	public String Hi() {
		return "Bonjour Railway";
	} 
}
