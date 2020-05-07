package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Example of Setter Injection
 * NOTE: This is a better way of injected and preferred over PropertyInjection.
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        //Create instance of controller
        controller = new SetterInjectedController();
        //So here instead of access the property directly we are going to create a new instance passed
        //via the setter.
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}