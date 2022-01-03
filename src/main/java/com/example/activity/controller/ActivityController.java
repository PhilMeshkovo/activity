package com.example.activity.controller;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ActivityController {

    public final RuntimeService runtimeService;

    @Autowired
    public ActivityController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping(value = "/start", produces = MediaType.APPLICATION_JSON_VALUE)
    public void startMethod() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("name", "Phil");
        variables.put("status", "two");

        runtimeService.startProcessInstanceByKey("TestProcess", variables);
        System.out.println("We have now " + runtimeService.createProcessInstanceQuery().count() + " process instances");
    }
}
