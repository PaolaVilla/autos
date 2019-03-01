/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Conexion;
import ec.edu.ister.vista.registroAutos;

/**
 *
 * @author Alexandra
 */
public class Main {
    static registroAutos vista = new registroAutos();
    
    public static void main(String[] args) {
        vista.setVisible(true);
    }
}
