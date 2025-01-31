package com.example.ApiDevelopment;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    List<ModelData> list = new ArrayList<>();

    public List<ModelData> data(){
        return list;
    }

    public String store(ModelData modelData){
        list.add(modelData);
        return "successfully stored";
    }
}
