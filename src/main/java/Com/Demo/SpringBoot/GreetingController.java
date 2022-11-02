package Com.Demo.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String Greeting(){
        return "hello from springboot";
    }
    @RequestMapping("/home")
    public String Home(){
        return "Hello your in  Home page";
    }

}
