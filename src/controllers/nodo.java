/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author Brian
 */
public class nodo {
    String nombre, contra , correo;
    nodo sig;

    public nodo(String nombre, String correo, String contra) {
        this.nombre = nombre;
        this.correo = correo;
        this.contra = contra;
        sig = null;
    }
    
    
    
}
