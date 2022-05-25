package pl.stormit.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.stormit.demo.dto.UserDto;

@RequestMapping("response-entity/")
@Controller
public class RequestEntity {

    @GetMapping("hello")
    ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello EAI Team", HttpStatus.OK);
    }

  @RequestMapping("user/{id}")
  ResponseEntity<UserDto>getUser(@PathVariable int id) {
      if(id==1) {
          return new ResponseEntity<>(
                  new UserDto("Mariusz", "kontakt@marian.pl"),
                  HttpStatus.OK
          );
      }
      return new ResponseEntity<>(
              HttpStatus.NOT_FOUND
      );
    }

    @GetMapping("complex")
    ResponseEntity<String> complexExample() {
        return ResponseEntity
                .accepted()
                .contentType(MediaType.TEXT_PLAIN)
                .header("custom-eai-header","Moj Header")
                .body("Jest Ok!");
    }
}
