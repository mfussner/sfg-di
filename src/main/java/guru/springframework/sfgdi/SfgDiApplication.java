package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run just returns a configurable application context.
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//Example of using profiles
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		//Here we want to get an instance of the MyController bean from the application context.
		//by default spring creates instance as class name with the first character lowercase.
		MyController myController = (MyController) ctx.getBean("myController");

		//execute the sayHello method on the controller.
		//String greeting = myController.sayHello();
		//will writing greeting output to the console.
		//System.out.println(greeting); // This should end up being "Hi Folks"

		System.out.println("------------- Primary Bean Default ---------------");
		System.out.println(myController.sayHello());

		System.out.println("------------- Property Injection -----------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------- Setter Injection -------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------- Constructor Injection -------------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());



	}

}
