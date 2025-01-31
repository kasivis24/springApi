package com.example.ApiDevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelData {
    private String name;
    private int uid;
    private List<String> skills = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
