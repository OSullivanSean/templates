package com.example.springboot.service.example;

import com.example.springboot.dao.example.ExampleDao;
import com.example.springboot.model.example.ExampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private final ExampleDao exampleDao;

    @Autowired
    public ExampleService(@Qualifier("in-memory") ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }

    public List<ExampleModel> getExampleModels(){
        return exampleDao.getExampleModels();
    }

    public ExampleModel getExampleModel(String id) {
        return exampleDao.getExampleModel(id);
    }

    public void insertExampleModel(ExampleModel exampleModel){
        exampleDao.insertExampleModel(exampleModel);
    }

    public void updateExampleModel(String id, ExampleModel exampleModel){
        exampleDao.updateExampleModel(id, exampleModel);
    }

    public void deleteExampleModel(String id){
        exampleDao.deleteExampleModel(id);
    }
}
