package pl.stormit.demo.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.stormit.demo.dto.UserDto;

import java.util.UUID;

@Controller
@RequestMapping("response-body-example/")
public class ResponseBodyExample {

    @RequestMapping("user")             //in this method serialization format is to default one - Jason
    @ResponseBody
    UserDto getUser() {
        return new UserDto("Tomek","kontakt@marian.pl");
    }
    @RequestMapping(value="user/xml" , produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    UserDto getUserXml() {              //in this method we changed serialization format to xml (by using additional variable)
        return new UserDto(UUID.randomUUID(),"Mariusz", "kontakt@marian.pl");
    }
}
