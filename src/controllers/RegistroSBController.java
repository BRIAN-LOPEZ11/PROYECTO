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
public class RegistroSBController implements Initializable {

    LoginController controllerwindow1;
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

    void init(String text, Stage stage, LoginController LoginController) {

        this.controllerwindow1 = LoginController;
        this.stage = stage;

    }


    @FXML
    private void showlogin(MouseEvent event) {
        controllerwindow1.show();
        stage.close();
    }

}
