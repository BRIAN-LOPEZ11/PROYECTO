/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class PerfilSB1Controller implements Initializable {
    
    listausuarios usuarios = listausuarios.obtenerListaUsuarios();
    
    OpenearController controllerwindow1;
    
    Stage stage;
    @FXML
    private Label lbluser;
    @FXML
    private Label lblcorreo;
    @FXML
    private Label lblcontra;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void viewproducto(MouseEvent event) {
        controllerwindow1.show();
        
        stage.close();
    }
    
    void init(String text, Stage stage, OpenearController OpenearController) {
        this.controllerwindow1 = OpenearController;
        this.stage = stage;
        lbluser.setText(usuarios.info.nombre);
        lblcorreo.setText(usuarios.info.correo);
        lblcontra.setText(usuarios.info.contra);
    }
    
}
