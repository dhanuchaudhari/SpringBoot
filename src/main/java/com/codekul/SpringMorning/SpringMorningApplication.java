package com.codekul.SpringMorning;


import com.codekul.SpringMorning.di2.Student1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringMorningApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringMorningApplication.class, args);

//		Vodafone object =context.getBean(Vodafone.class);
//		object.calling();
//		object.data();
//



		Student1 st =context.getBean(Student1.class);
		st.show();

	}
	@GetMapping("hi")
	public  String hellomsg(){
		return "hello";
	}

}