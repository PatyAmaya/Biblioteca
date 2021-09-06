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
        usuarios.put("11111", createUsuario("140121","Ricardo"));
        usuarios.put("220521", createUsuario("322224", "Betty"));
        usuarios.put("121234", createUsuario("121234","Armando"));
        usuarios.put("654663", createUsuario("654663","Marcela"));
        usuarios.put("867574", createUsuario("867574","Patricia"));
        usuarios.put("624546", createUsuario("624546","Mario"));
        usuarios.put("968857", createUsuario("968857","Nicolas"));
        usuarios.put("424265", createUsuario("424265","Inesita"));
        usuarios.put("875735", createUsuario("875735","Freddy"));
        usuarios.put("254456", createUsuario("254456","Maria"));
        usuarios.put("986653", createUsuario("986653","Julia"));
    }


    public User dameUsuarioPorClave(String clave) {
        return usuarios.get(clave);
    }
}
