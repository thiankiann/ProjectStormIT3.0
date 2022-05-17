package pl.stormit.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request-param-example")
public class RequestParamExamples {

    @GetMapping
    String withSingleVariable(@RequestParam(required = false) String id) {
        return "single variable => "+id;
    }
    @GetMapping("/int")
    String withSingleVariable(@RequestParam(required = false)  int id){
        return "single int variable => "+id;
    }

    @GetMapping("{id}")
    String withPathVariable(@PathVariable String id, @RequestParam String id2){
        return String.format("variables => (%s, %s)",id, id2);
    }
    @GetMapping("names")
    String withTwoVariablesAndNames(@RequestParam("a") String a,@RequestParam("b") String b) {
        return String.format("variables with names => (%s, %s)",a,b);
    }
}
