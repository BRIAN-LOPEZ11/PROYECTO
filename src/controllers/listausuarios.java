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
      public boolean getCrearNodo(
            TextField txtuser,
            TextField txtcorreo,
            PasswordField txtcontraseña
    ) {
        nodo b = null;
        info = null;
        try {
            b = getBuscarcorreo(txtcorreo.getText());
            if (b != null) {
                JOptionPane.showMessageDialog(null,
                        "Este correo ya ha sido registrado");
                txtcorreo.setText("");
                txtcorreo.requestFocus();
            } else {
                info = new nodo(
                        txtuser.getText(),
                        txtcorreo.getText(),
                        txtcontraseña.getText()
                );
                JOptionPane.showMessageDialog(null,
                        "USUARIO REGISTRADO");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e + ". NO SE HA REGISTRADO NINGÚN USUARIO");
            info = null;
            return false;
        }
    }
       public void setAddI(
            TextField txtuser,
            TextField txtcorreo,
            PasswordField txtcontraseña
    ) {
        getCrearNodo(txtuser, txtcorreo, txtcontraseña);
        if (info != null) {
            if (cab == null) {
                cab = info;
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado el nodo a la lista, "
                        + "la lista estaba vacía.");
                txtcorreo.setText("");
                txtuser.setText("");
                txtcontraseña.setText("");
                txtuser.requestFocus();
            } else {
                info.sig = cab;
                cab = info;
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado el nodo al principio "
                        + "de la lista.");
                txtcorreo.setText("");
                txtuser.setText("");
                txtcontraseña.setText("");
                txtuser.requestFocus();
            }
        }
    }
     

}
