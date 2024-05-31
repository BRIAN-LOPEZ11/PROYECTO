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
public class PerfilSBController implements Initializable {

    SamsumgController controllerwindow1;
    listausuarios usuarios = listausuarios.obtenerListaUsuarios();

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

    void init(String text, Stage stage, SamsumgController SamsumgController) {
        this.controllerwindow1 = SamsumgController;
        this.stage = stage;
        lbluser.setText(usuarios.info.nombre);
        lblcorreo.setText(usuarios.info.correo);
        lblcontra.setText(usuarios.info.contra);
    }

    @FXML
    private void viewproducto(MouseEvent event) {

        controllerwindow1.show();

        stage.close();
    }

}
