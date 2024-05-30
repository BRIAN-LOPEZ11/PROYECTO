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
public class LaptopController implements Initializable {

    @FXML
    private ImageView regreso;
    @FXML
    private Label txtuser;
    listacompras comprass = listacompras.obtenerListaCompra();
    CarritoController controllerwindow1;
    Stage stage;

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

    void init(String text, Stage stage, CarritoController CarritoController) {
        txtuser.setText(text);
        this.controllerwindow1 = CarritoController;
        this.stage = stage;

    }

    @FXML
    private void AgregarcarritoLaptop(ActionEvent event) {
                int r = JOptionPane.showConfirmDialog(null, "DESEA AÑADIR OPENEAR AL CARRITO",
                "confirmation", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            int n;
            n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos desea añadir"));
            if (n == 0) {
                JOptionPane.showMessageDialog(null, "NO SE AÑADIERON ARTÍCULOS");
            } else {
                int pagolaptop = n * 400;
                comprass.info.setPlatop(pagolaptop);
                JOptionPane.showMessageDialog(null, "SUS ARTÍCULOS HAN SIDO AÑADIDOS");

            }
        } else if (r == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "NO SE AÑADIERON ARTÍCULOS");
        }
    }
    

}
