package pl.stormit.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.stormit.demo.dto.UserDto;

import java.util.UUID;

@RestController
@RequestMapping("request-body-example")
public class RequestBodyExample {

    @PostMapping
    UserDto createUser( @RequestBody UserDto userDto) {
        userDto.setId(UUID.randomUUID());

        System.out.println("Create user ... " + userDto);

        return userDto;
    }
}
