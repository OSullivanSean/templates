package com.example.springboot.dao.example;

import com.example.springboot.model.example.ExampleModel;

import java.util.List;

public interface ExampleDao {

    List<ExampleModel> getExampleModels();

    ExampleModel getExampleModel(String id);

    void insertExampleModel(ExampleModel exampleModel);

    void updateExampleModel(String id, ExampleModel exampleModel);

    void deleteExampleModel(String id);
}
