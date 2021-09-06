package edu.uaslp.library.model;

import java.time.LocalDateTime;

public class Prestamo {
    private LocalDateTime fechaHora;
    private User usuario;
    private Book libro;
    private Employee empleado;

    //methods



    //Setters

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Book libro) {
        this.libro = libro;
    }

    public void setEmpleado(Employee empleado) {
        this.empleado = empleado;
    }

    //Getters

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public User getUsuario() {
        return usuario;
    }

    public Book getLibro() {
        return libro;
    }

    public Employee getEmpleado() {
        return empleado;
    }

}
