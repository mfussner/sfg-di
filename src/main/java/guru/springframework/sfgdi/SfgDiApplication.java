package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run just returns a configurable application context.
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//Here we want to get an instance of the MyController bean from the application context.
		//by default spring creates instance as class name with the first character lowercase.
		MyController myController = (MyController) ctx.getBean("myController");

		//execute the sayHello method on the controller.
		String greeting = myController.sayHello();
		//will writing greeting output to the console.
		System.out.println(greeting); // This should end up being "Hi Folks"
	}

}
