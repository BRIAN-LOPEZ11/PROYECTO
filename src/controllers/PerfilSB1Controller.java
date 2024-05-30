/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class PerfilSB1Controller implements Initializable {

    OpenearController controllerwindow1;
    
    Stage stage;
    @FXML
    private TextField txtuser;
    @FXML
    private TextField txtuser1;
    @FXML
    private TextField txtuser11;

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
    }
    
}
