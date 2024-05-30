/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class OpenearController implements Initializable {
    
    COMPRAS compraf = new COMPRAS(0,0,0,0);
    CarritoController controllerwindow1;
    Stage stage;
    @FXML
    private Label txtuser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    void init(String text, Stage stage, CarritoController CarritoController) {
        txtuser.setText(text);
        this.controllerwindow1 = CarritoController;
        this.stage = stage;
    }
    void show() {
        stage.show();
    }

    @FXML
    private void viewcompra(MouseEvent event) {
        controllerwindow1.show();
        stage.close();
    }

    @FXML
    private void viewcarrito(MouseEvent event) {
        controllerwindow1.show();
        stage.close();
    }

    @FXML
    private void viewperfil(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/PerfilSB_1.fxml"));
        Parent root = loader.load();
        PerfilSB1Controller controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(txtuser.getText(), stage, this);
        stage.show();
        this.stage.close();
    }

    @FXML
    private void viewcompraf(MouseEvent event) {
    }

    @FXML
    private void AgregarCarritoOpenear(ActionEvent event) {
        int r = JOptionPane.showConfirmDialog(null,"DESEA AÑADIR OPENEAR AL CARRITO",
                "confirmation",JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
           int n;
           n =Integer.parseInt(JOptionPane.showInputDialog("Cuantos desea añadir"));
           if(n == 0){
               JOptionPane.showMessageDialog(null, "NO SE AÑADIERON ARTÍCULOS");
           }else{
               int pagoopenear= n*130;
               compraf.setPopenear(pagoopenear);
                JOptionPane.showMessageDialog(null, "SUS ARTÍCULOS HAN SIDO AÑADIDOS");
               
           }
        }else if (r==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "NO SE AÑADIERON ARTÍCULOS");
        }
    }

}
