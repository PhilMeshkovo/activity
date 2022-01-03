package com.example.activity.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

@org.springframework.stereotype.Service
public class ServiceTwo implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Second block - " + delegateExecution.getVariables().get("name") + " "
                + delegateExecution.getVariables().get("lastName"));
    }
}
