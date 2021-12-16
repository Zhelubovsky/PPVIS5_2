package org.example.lab.model;

import org.example.lab.model.entities.Admins;
import org.example.lab.model.entities.Users;

public class Model {

    private Users users;
    private Admins admins;

    public Model(){
        users = new Users();
        admins = new Admins();
    }


}
