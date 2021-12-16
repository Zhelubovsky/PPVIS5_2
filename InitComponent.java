package org.example.lab;

import org.example.lab.controller.Controller;
import org.example.lab.model.Model;
import org.example.lab.view.View;

public class InitComponent {

    private View view;
    private Model model;
    private Controller controller;

    public void init(){
        view = new View();
        model = new Model();
        controller = new Controller();
    }
}
