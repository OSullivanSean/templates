package com.example.springboot.dao.example;

import com.example.springboot.model.example.ExampleModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("in-memory")
public class InMemoryExampleDao implements ExampleDao{

    private static Map<String, ExampleModel> DB = new HashMap<>();

    @Override
    public List<ExampleModel> getExampleModels() {
        return new ArrayList<>(DB.values());
    }

    @Override
    public ExampleModel getExampleModel(String id) {
        return DB.get(id);
    }

    @Override
    public void insertExampleModel(ExampleModel exampleModel){
        if(!DB.containsKey(exampleModel.getId())){
            DB.put(exampleModel.getId(), exampleModel);
        }
    }

    @Override
    public void updateExampleModel(String id, ExampleModel exampleModel) {
        if(DB.containsKey(id)){
            DB.put(id, exampleModel);
        }
    }

    @Override
    public void deleteExampleModel(String id) {
        DB.remove(id);
    }

}
