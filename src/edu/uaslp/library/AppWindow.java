package edu.uaslp.library;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import edu.uaslp.library.model.*;
import edu.uaslp.library.service.*;

public class AppWindow {
    private static final int WIDTH = 700;
    private static final int HEIGHT = 600;
    private JLabel bookNameLabel = new JLabel("Aqui va el nombre",SwingConstants.LEFT);
    private String clave;
    private JLabel studentNameLabel = new JLabel("Aqui va el nombre", SwingConstants.LEFT);
    //String nombreLibro = bookNameLabel.getText();
    UserManager administradorDeUsuarios = new UserManager();
    User usuario = new User();
    String[] data = new String[4];
    private int cont=0;
    JList<String> list = new JList<>(data); //data has type Object[]

   /* User usuario = new User();
    Book libro = new Book();
    UserManager administradorDeUsuarios = new UserManager();*/

    public void show() {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        addStudentControls(panel);
        addBookContents(panel);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 0.05;
        constraints.gridy = 4;
        panel.add(new JSeparator(SwingConstants.VERTICAL), constraints);

        addListOfLoans(panel);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 6;
        constraints.ipady = 20;
        Button prestarBtn = new Button("Prestar");
        prestarBtn.addActionListener(this::performLoan);
        panel.add(prestarBtn, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.gridy = 7;
        panel.add(new JSeparator(SwingConstants.VERTICAL), constraints);

        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private void addListOfLoans(JPanel panel) {

        data[0] = "Prestamo 1";
        data[1] = "Prestamo 2";
        data[2] = "Prestamo 3";
        data[3] = "Prestamo 4";


        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);

        list.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 5;
        panel.add(listScroller, constraints);

    }

    private void addBookContents(JPanel panel) {
        JLabel labelBookKey = new JLabel("Clave del libro: ");
        JPanel firstRow = new JPanel();
        firstRow.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        JTextField bookKey = new JTextField();

        constraints.gridx = 0;
        firstRow.add(labelBookKey, constraints);

        constraints.gridx = 1;
        firstRow.add(bookKey, constraints);

        constraints.gridx = 2;
        JButton buttonKeyQuery = new JButton("Consultar");
        buttonKeyQuery.addActionListener(this::queryBook);
        firstRow.add(buttonKeyQuery, constraints);

        constraints.gridx = 3;
        JButton buttonKeyAdd = new JButton("Agregar");
        buttonKeyAdd.addActionListener(this::addBookToLoan);
        firstRow.add(buttonKeyAdd, constraints);

        JPanel secondRow = new JPanel();
        secondRow.setLayout(new GridBagLayout());
        JLabel bookLabel = new JLabel("Libro:");
        constraints.gridx = 0;
        secondRow.add(bookLabel, constraints);

        //MUESTRA NOMBRE DEL LIBRO
        //bookNameLabel = new JLabel("Titulo: ", SwingConstants.LEFT);
        constraints.gridx = 1;
        secondRow.add(bookNameLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 2;
        panel.add(firstRow, constraints);
        constraints.gridy = 3;
        panel.add(secondRow, constraints);
    }

    private void addStudentControls(JPanel panel) {
        JLabel label = new JLabel("Clave del alumno: ");
        JPanel firstRow = new JPanel();
        firstRow.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        firstRow.add(label, constraints);

        //CAPTURA CLAVE DEL USUARIO en studentkey de JTEXTFIELD
        JTextField studentKey = new JTextField();
        constraints.gridx = 1;
        firstRow.add(studentKey, constraints);
        this.clave = studentKey.getText();

        JButton buttonQuery = new JButton("Consultar");
        constraints.gridx = 2;
        buttonQuery.addActionListener(this::queryStudent);
        firstRow.add(buttonQuery, constraints);

        JPanel secondRow = new JPanel();
        constraints.gridx = 0;
        secondRow.setLayout(new GridBagLayout());
        JLabel studentLabel = new JLabel("Alumno:");
        secondRow.add(studentLabel, constraints);

        //studentNameLabel = new JLabel("Aqui va el nombre", SwingConstants.LEFT);
       // studentNameLabel.setText("Aqui va el nombre");
        constraints.gridx = 1;
        secondRow.add(studentNameLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 0.05;
        panel.add(firstRow, constraints);
        constraints.weighty = 0;
        constraints.gridy = 1;
        panel.add(secondRow, constraints);

    }

    private void queryStudent(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Consultando estudiante");

        usuario=administradorDeUsuarios.dameUsuarioPorClave("11111");
        if(usuario!=null){
            JOptionPane.showMessageDialog(null, "Usuario encontrado");
            studentNameLabel.setText(usuario.getName());
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }

    private void addBookToLoan(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Añadiendo Libro");

        data[cont] = "titulo";

        cont++;
        System.out.println(cont);

    }

    private void queryBook(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Consultando Libro");
        BookManager administradorDeLibros = new BookManager();
        Book libro = new Book();
        libro=administradorDeLibros.dameLibroPorClave("123");
        if(libro!=null)
        {
            JOptionPane.showMessageDialog(null, "Libro encontrado");
            bookNameLabel.setText(libro.getTitle());
        }else{
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }

    private void performLoan(ActionEvent event) {
        if(cont==1)
        {
            JOptionPane.showMessageDialog(null, "Se prestó "+ cont+" libro a "+usuario.getName());
        }else{
            JOptionPane.showMessageDialog(null, "Se prestaron "+ cont+" libros a "+usuario.getName());
        }

    }

}
