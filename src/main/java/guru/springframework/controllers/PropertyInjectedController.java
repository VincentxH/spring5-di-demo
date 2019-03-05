package guru.springframework.controllers;

import guru.springframework.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){

		return greetingServiceImpl.sayGreeting() + " " + PropertyInjectedController.class.getSimpleName();
    }

}
