import javax.swing.*;
import java.awt.event.*;

import static java.lang.System.*;
//Inicio del programa

public class Interfaz1 implements ActionListener{

    private static JLabel usuario;
    private static JLabel contra;
    private static JPasswordField texto2;
    private static JTextField texto1;
    private static JButton boton;

    int intentos = 3;


    private static JLabel ingreso;
    public static void main(String [] args){
        JFrame marco = new JFrame();
        JPanel panel = new JPanel();
        marco.setSize(480,480);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(panel);

        panel.setLayout(null);
        usuario = new JLabel("Usuario");
        usuario.setBounds(10, 20, 80, 25);
        panel.add(usuario);

        texto1 = new JTextField();
        texto1.setBounds(100, 20, 165, 25);

        contra = new JLabel("Contraseña");
        contra.setBounds(10, 50, 80, 25);
        panel.add(contra);

        texto2 = new JPasswordField();
        texto2.setBounds(100, 50, 165, 25);
        panel.add(texto2);

        boton = new JButton("Entrar");
        boton.setBounds(10, 80, 80,25);
        boton.addActionListener(new Interfaz1());
        panel.add(boton);

        ingreso = new JLabel("");
        ingreso.setBounds(10, 110, 300, 25);
        panel.add(ingreso);




        panel.add(texto1);

        marco.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario_ = texto1.getText();
        String contrasena = texto2.getText();

        String acceso1 = "fabian";
        String acceso2 = "fabian10";


        out.println(usuario_ +", "+contrasena);


        if (usuario_.equals("fabian") && contrasena.equals("fabian10")) {
            ingreso.setText("El ingreso es exitoso");

        } else if (usuario_.contains(acceso1) && contrasena != acceso2) {
             ingreso.setText("El usuario es correcto, pero la contraseña no");



        } else if (!usuario_.equals(acceso1) && contrasena.contains(acceso2)) {

            ingreso.setText("La contraseña es correcta, pero el usuario no");

        } else {
            ingreso.setText("Ninguno de los datos es correcto");


        }
        intentos = intentos -1;
        out.println(intentos);
        if (intentos == 0){
            ingreso.setText("Los intentos se han acabado");

        }else if(intentos == -1){
            System.exit(1);
        }


    }



}

