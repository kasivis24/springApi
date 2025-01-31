package com.example.ApiDevelopment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class Controller {

    @Autowired
    ApiService apiService;



    @GetMapping("/data")
    public List<ModelData> data(){
        return apiService.data();
    }

    @PostMapping("/sent")
    public String sentData(@RequestBody ModelData modelData){
        apiService.store(modelData);
        return "SuccessFully Sended";
    }



}
