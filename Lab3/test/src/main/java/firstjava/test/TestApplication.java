package firstjava.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication /*main applicatiomn class */
@RestController /*class contains web endpoints */
public class TestApplication {

	/*main method*/
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		/*Starts the Spring Boot application 
		Makes endpoints live*/
	}

	/*1. normal static way static root endpoints
	*@GetMapping("/")
	public String rootEndpoint() {
		String message =  "Hello, World!";
		return message;
	}*/

	/*2. Spring maps:
	URL /hello
	Still static, but different path.

		@GetMapping("/hello")
	public String rootEndpoint() {
		String message =  "Hello, World!";
		return message;
	}*/

	/*3. Accept a Query Parameter (name)
	Spring to read a value from the URL like:
	http://localhost:8080/hello?name=Amith*/

	/*@GetMapping("/hello")
	public String helloEndpoint(@RequestParam String name) {
		String message =  "Hello, " + name + "!";
		return message;
	}*/

	/*4. verson with optional parameter, 
	@RequestParam Tells Spring:
	“Get value from URL query parameter.”
	defaultValue = "Bro"
	If name is provided: it will be displayed.*/

	@GetMapping("/hello")
	public String helloEndpoint(@RequestParam(required = false, defaultValue = "Bro") String name) {
		String message =  "Hello, " + name + "!";
		return message;
	}
}
