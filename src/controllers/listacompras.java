/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author Brian
 */
public class listacompras {
    private static listacompras lista;
    
    COMPRAS cab;
    COMPRAS info = new COMPRAS(0,0,0,0);

    private listacompras() {
        cab = null;
    }
    
     public static listacompras obtenerListaCompra(){
        if (lista == null){
            lista = new listacompras();
        }
        return lista;
    }
     
}
