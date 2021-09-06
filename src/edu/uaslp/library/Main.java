package edu.uaslp.library;

import edu.uaslp.library.model.Prestamo;
import edu.uaslp.library.model.User;
import edu.uaslp.library.model.Employee;
import edu.uaslp.library.model.Book;

import edu.uaslp.library.service.*;

import java.time.*;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        UserManager administradorDeUsuarios = new UserManager();
        User usuario = administradorDeUsuarios.dameUsuarioPorClave("55555");

        BookManager administradorDeLibros = new BookManager();
        Book libro = administradorDeLibros.dameLibroPorClave("456");

        Employee empleado = new Employee();

        empleado.setName("Ivan");
        empleado.setCode("12345");

        Prestamo prestamo = new Prestamo();

        prestamo.setFechaHora(LocalDateTime.now());
        prestamo.setUsuario(usuario);
        prestamo.setLibro(libro);
        prestamo.setEmpleado(empleado);

        //imprimePrestamo(prestamo);


        SwingUtilities.invokeLater(() -> new AppWindow().show());

    }
    /*public static void imprimePrestamo(Prestamo prestamo) {
        System.out.println("Prestamo de " + prestamo.getFechaHora());
        System.out.println("Usuario: " + prestamo.getUsuario().getName());
        System.out.println("Empleado: " + prestamo.getEmpleado().getName());
        System.out.println("Libro: " + prestamo.getLibro().getTitle());
    }*/
}

