package com.shez.test.cucumber.stepdefs;

import com.shez.test.JhipTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
