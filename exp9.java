import org.springframework.boot.*; 
import org.springframework.boot.autoconfigure.*; 
import org.springframework.web.bind.annotation.*; 
@SpringBootApplication 
@RestController 
public class RestApiApp { 
public static void main(String[] args) { 
SpringApplication.run(RestApiApp.class, args); 
} 
@GetMapping("/hello") 
public String hello() { 
return "{\"message\": \"Hello, AKHAND PRATAP SHUKLA!\"}"; 
} 
}
