package pl.stormit.demo.content_type;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.stormit.demo.dto.UserDto;

import java.util.UUID;

@RestController
@RequestMapping("content-type-example/")
public class ContentTypeExample {

    @GetMapping("user")
    UserDto getUser() {
        return user();
    }

    @GetMapping(value = "user/xml" , produces = MediaType.APPLICATION_XML_VALUE)
    UserDto getUserXml() {
        return user();
    }
    @GetMapping(
            value = "user/content-negotiation",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    UserDto getUserContentNegotiation(){
        return user();
    }

    @PutMapping(
                value = "user",
                consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    UserDto getUserContentNegotiation(@RequestBody UserDto userDto){
        userDto.setId(UUID.randomUUID());

        return userDto;
    }
    private UserDto user() {
        return new UserDto("Mariusz", "kontakt@marian.pl");
    }
}
