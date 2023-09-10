package sg.ntu.edu.springbootjavaprojectsctpmodule3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJavaProjectSctpModule3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJavaProjectSctpModule3Application.class, args);
	}

	

	@Override
	public String toString() {
		return "SpringbootJavaProjectSctpModule3Application []";
	}

}
