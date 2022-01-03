package com.example.activity.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

@org.springframework.stereotype.Service
public class Service implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("lastName", "Blinov");

        System.out.println("Hello from Activity!!! " + delegateExecution.getVariables().get("name") + "!!!");
        System.out.println("Hello from Activity!!! " + delegateExecution.getVariables().get("status") + "!!!");
    }
}
