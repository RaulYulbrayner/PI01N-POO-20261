package uniquindio.edu.co;

import uniquindio.edu.co.model.Taller;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class app {

    public static void main(String[] args) {

        Taller taller = new Taller("Taller Yulbraynner", "2N", "12345");
        //Crear cliente
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
        String email = JOptionPane.showInputDialog("Ingrese el email del cliente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");

        String respuesta =  taller.crearCliente(nombre, telefono, email, cedula);
        JOptionPane.showMessageDialog(null, respuesta);

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String telefono1 = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
        String email1 = JOptionPane.showInputDialog("Ingrese el email del cliente:");
        String cedula1 = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");

        String respuesta1 =  taller.crearCliente(nombre1, telefono1, email1, cedula1);
        JOptionPane.showMessageDialog(null, respuesta1);



        JOptionPane.showMessageDialog(null, taller.toString());


    }
}