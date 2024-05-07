/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class CarritoController implements Initializable {
    LoginController controllerwindow1;
    Stage stage;

    @FXML
    private Label lbluser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void showWindow1(ActionEvent event) {
    }

    void init(String text, Stage stage, LoginController LoginController) {
        lbluser.setText(text);
        this.controllerwindow1 = LoginController;
        this.stage = stage;
        
        
    }
    
}
