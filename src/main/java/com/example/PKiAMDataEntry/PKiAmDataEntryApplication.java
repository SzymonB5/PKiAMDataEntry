package com.example.PKiAMDataEntry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PKiAmDataEntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PKiAmDataEntryApplication.class, args);
	}

	@GetMapping("/test")
	public String test() {
		return "Test 123";
	}

	@GetMapping("/addUser")
	public String addUser() {
		StringBuilder stringBuilder = new StringBuilder("<html>");
		stringBuilder.append("<body>");

		stringBuilder.append("<label> FirstName </label><br/>");
		stringBuilder.append("<input type=\"text\" id=\"tbFirstName\"/><br/>");

		stringBuilder.append("<label> LastName </label><br/>");
		stringBuilder.append("<input type=\"text\" id=\"tbLastName\"/><br/>");

		stringBuilder.append("<label> Password </label><br/>");
		stringBuilder.append("<input type=\"text\" id=\"tbPassword\"/><br/>");

		stringBuilder.append("<button type=\"button\" onclick=\"myFunction()\">Submit</button><br/>");

		stringBuilder.append("<script>");
		stringBuilder.append("function myFunction() {");
		stringBuilder.append("    alert(\"Button clicked!\");");
		stringBuilder.append("}");
		stringBuilder.append("</script>");

		stringBuilder.append("</body>");
		stringBuilder.append("</html>");
		return stringBuilder.toString();
	}

}
