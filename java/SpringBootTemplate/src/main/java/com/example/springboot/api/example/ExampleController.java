package com.example.springboot.api.example;

import com.example.springboot.model.example.ExampleModel;
import com.example.springboot.service.example.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/example")
@RestController
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    //GET url=localhost:8080/api/example
    @GetMapping
    public List<ExampleModel> getExampleModels(){
        return exampleService.getExampleModels();
    }

    //GET url=localhost:8080/api/example/someIDValue
    @GetMapping(path = "{id}")
    public ExampleModel getExampleModel(@PathVariable("id") String id){
        return exampleService.getExampleModel(id);
    }

    //POST url=localhost:8080/api/example, body={"id":"someIDValue","data":"someData"}
    @PostMapping
    public void insertExampleModel(@RequestBody ExampleModel exampleModel){
        exampleService.insertExampleModel(exampleModel);
    }

    //POST url=localhost:8080/api/example/someIDValue, body={"id":"someIDValue","data":"updatedData"}
    @PutMapping(path = "{id}")
    public void updateExampleModel(@PathVariable("id") String id, @RequestBody ExampleModel exampleModel){
        exampleService.updateExampleModel(id, exampleModel);
    }

    //DELETE url=localhost:8080/api/example/someIDValue
    @DeleteMapping(path = "{id}")
    public void deleteExampleModel(@PathVariable("id") String id){
        exampleService.deleteExampleModel(id);
    }
}
