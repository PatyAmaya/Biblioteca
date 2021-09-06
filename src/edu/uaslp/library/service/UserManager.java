package edu.uaslp.library.service;

import edu.uaslp.library.model.User;

import javax.swing.*;
import java.util.HashMap;

public class UserManager {

    private HashMap<String, User> usuarios=new HashMap<>();

    private User createUsuario(String clave, String nombre){
        User usuario = new User();

        usuario.setCode(clave);
        usuario.setName(nombre);

        return usuario;
    }

    public UserManager(){
        usuarios.put("12345", createUsuario("1","Ricardo"));
        usuarios.put("23456", createUsuario("2", "Betty"));
        usuarios.put("34567", createUsuario("3","Armando"));
        usuarios.put("45678", createUsuario("4","Marcela"));
        usuarios.put("56789", createUsuario("5","Patricia"));
        usuarios.put("67890", createUsuario("6","Mario"));
        usuarios.put("78901", createUsuario("7","Nicolas"));
        usuarios.put("89012", createUsuario("8","Catalina"));
        usuarios.put("90123", createUsuario("9","Freddy"));
        usuarios.put("01234", createUsuario("254456","Hugo"));
    }


    public User dameUsuarioPorClave(String clave) {
        return usuarios.get(clave);
    }
}
