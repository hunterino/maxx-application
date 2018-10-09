package twohtwo.maxx.application.cucumber.stepdefs;

import twohtwo.maxx.application.MaxxApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MaxxApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
