package pl.stormit.demo.Exception_handling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exception-handling-example")
public class ExceptionHandlingExample {

    @RequestMapping("npe")
    void nullPointExceptionExample(){
        String s = null;
        s.toString();
    }
}
