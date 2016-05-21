package edu.learn.controller;


import org.springframework.ui.ModelMap;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexControllerTest {
    @Test
    public void testHandleRequestView() throws Exception {
        IndexController controller = new IndexController();
        String abc = controller.welcome(new ModelMap());
        Assert.assertEquals(abc,"index");
    }
}