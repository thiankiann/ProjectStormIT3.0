package pl.stormit.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("response-mapping-example")
public class ResponsStatusExample {

    @GetMapping
    String defaultExample() {
        return "default example";
    }
    @GetMapping("accepted")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String acceptedExample() {
        return "accepted example";
    }
    @GetMapping("teapot")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    void teaPot() {}
}
