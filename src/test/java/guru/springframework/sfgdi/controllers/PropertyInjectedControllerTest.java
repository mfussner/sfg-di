package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Example of property injection.
 * NOTE: This is the least preferred method.
 */

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        //Here we are essentially doing what spring framework would do for us.
        //1. create new controller object.
        controller = new PropertyInjectedController();
        //2. controller is dependent on a property called greeting service.
        //so we are going to make the property greeting service = to a new instance of greeting
        //service.  Hence we are injecting the property manually with an instance of the obj.
        controller.greetingService = new PropertyInjectedGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}