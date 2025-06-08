// Controller.java 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.*; 
@Controller 
public class WebController { 
@GetMapping("/form") 
public String formPage() { 
return "form"; 
} 
@PostMapping("/submit") 
public String submitForm(@RequestParam String name, Model model) { 
model.addAttribute("name", name); 
return "result"; 
} 
} 
 
//Form.html 
<!DOCTYPE html> 
<html xmlns:th="http://www.thymeleaf.org"> 
<head> 
<title>Input Form</title> 
</head> 
<body> 
<h1>Enter Your Name</h1> 
<form action="/submit" method="post"> 
<label for="name">Name:</label> 
<input type="text" id="name" name="name" required /> 
<button type="submit">Submit</button> 
</form> 
</body> 
</html> 
 
 
//Result.html 
<!DOCTYPE html> 
<html xmlns:th="http://www.thymeleaf.org"> 
<head> 
<title>Result</title> 
</head> 
<body> 
<h1>Submitted Data</h1> 
<p>Welcome, <span th:text="${name}">[Name]</span>!</p> 
<a href="/form">Go Back</a> 
</body> 
</html> 
