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
     public boolean getEsVacia() {
        return cab == null ? true : false;
    }
     public int getLongLista() {
        if (getEsVacia()) {
            return 0;
        } else {
            nodo p = cab;
            int cont = 0;
            while (p != null) {
                cont++;
                p = p.sig;
            }
            return cont;
        }
    }
      public nodo getBuscarcorreo(String txtcorreo) {
        if (getEsVacia()) {
            return null;
        } else {
            nodo p = cab;
            while (p != null) {
                if (p.correo.equalsIgnoreCase(txtcorreo)) {

                    return p;
                } else {
                    p = p.sig;
                }
            }
            return null;
        }
    }
     

}
