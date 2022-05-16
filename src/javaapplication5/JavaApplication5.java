/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author gamei
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var = JOptionPane.showInputDialog("Ingrese el día");

        if (var.equalsIgnoreCase("sabado")) {
            JOptionPane.showInputDialog("El dia " + var + " Es un dia festivo");
        } else {
            if (var.equalsIgnoreCase("domingo")) {
                JOptionPane.showInputDialog("El dia " + var + " Es un dia festivo");
            } else {
                if (var.equalsIgnoreCase("lunes")) {
                    JOptionPane.showInputDialog("El dia " + var + " Es un dia Laboral");
                } else {
                    if (var.equalsIgnoreCase("martes")) {
                        JOptionPane.showInputDialog("El dia " + var + " Es un dia Laboral");
                    } else {
                        if (var.equalsIgnoreCase("miercoles")) {
                            JOptionPane.showInputDialog("El dia " + var + " Es un dia Laboral");
                        } else {
                            if (var.equalsIgnoreCase("jueves")) {
                                JOptionPane.showInputDialog("El dia " + var + " Es un dia Laboral");
                            } else {
                                if (var.equalsIgnoreCase("viernes")) {
                                    JOptionPane.showInputDialog("El dia " + var + " Es un dia Laboral");
                                } else {
                                    JOptionPane.showInputDialog("El valor " + var + " no es ningun valor correcto de la semana");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
