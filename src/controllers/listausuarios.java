/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.nodo;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class listausuarios {

    private static listausuarios lista;
    
    nodo cab;
    nodo info;

    private listausuarios() {
        cab = null;
    }
    
     public static listausuarios obtenerListaUsuarios(){
        if (lista == null){
            lista = new listausuarios();
        }
        return lista;
    }
     

}
