package pl.stormit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("path-variable-example")
public class PathVariableExamples {

    @GetMapping
    String mainPath(){
        return "main-path";
    }
    @GetMapping("{id}")
    String withSingleVariable(@PathVariable String id){
        return "single variable =>"+id;
    }
    @GetMapping("/int/{id}")
    String withSingleIntVariable(@PathVariable int id){
        return "single variable =>"+id;
    }
    @GetMapping("{id}/{id2}")
    String withTwoVariables(@PathVariable String id, @PathVariable String id2){
        return String.format("Two variables -> id: %s , id2: %s",id, id2);
    }
    @GetMapping("{id}//{id2}")
    String withTwoVariablesAndNames(@PathVariable("id2") String id2, @PathVariable("id") String id){
        return String.format(" Two variables with names -> id: %s ,id2: %s", id, id2);
    }
}
