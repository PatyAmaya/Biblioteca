import java.time.*;
class Book{
    private String author;
    private String isbn;
    private String title;
    private String editorial;

    //methods
    //Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    //Getters
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getEditorial() {
        return editorial;
    }
}

class User{
    private String name;
    private String code;
    private String phone;
    private String email;
    private String addres;
    private LocalDate registerDate;

    //methods
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddres() {
        return addres;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }
}

class Employ{
    private String name;
    private String code;

    //methods
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}

class Prestamo{
    private LocalDateTime fechaHora;
    private User usuario;
    private Book libro;
    private Employ empleado;

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

    public void setEmpleado(Employ empleado) {
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

    public Employ getEmpleado() {
        return empleado;
    }
}

class UserManager{
    public void dameUsuarioPorClave(String clave) {

    }
}

class BookManager{
    public void dameLibroPorClave(String clave){

    }
}

class AdministradorDePrestamos{
    public void registraPrestamo(Employ empleado, User usuario, Book libro[]){

    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
    }
}
