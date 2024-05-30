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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class CompraController implements Initializable {

    listacompras comprass = listacompras.obtenerListaCompra();
  
    CarritoController controllerwindow1;
    Stage stage;
    @FXML
    private ImageView regreso;
    @FXML
    private Label txtuser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewcarrito(MouseEvent event) {
        controllerwindow1.show();
        stage.close();
    }

    void init(String text, Stage stage, CarritoController CarritoController ) {
        txtuser.setText(text);
        this.controllerwindow1 = CarritoController;
        this.stage = stage;
    }

    @FXML
    private void mostrarcompras(ActionEvent event) {
        
        JOptionPane.showMessageDialog(null, "OPENEAR: "+comprass.info.getPopenear()+"\n SAMSUMG: "+comprass.info.getPsamsumg()+"\n PLAYSTATION: "+"\n LAPTOP: ");
    }
    
    
}
