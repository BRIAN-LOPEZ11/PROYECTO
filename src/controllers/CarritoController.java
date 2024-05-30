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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    @FXML
    private ImageView imgvsamsumg;
    @FXML
    private ImageView imgvlaptop;
    @FXML
    private ImageView imgvplaystation;
    @FXML
    private ImageView imgvauriculares;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void showWindow1(ActionEvent event) {
        controllerwindow1.show();
        stage.close();
    }
    void show() {
        stage.show();
    }

    void init(String text, Stage stage, LoginController LoginController) {
        lbluser.setText(text);
        this.controllerwindow1 = LoginController;
        this.stage = stage;
        
        
    }

    @FXML
    private void viewventanasamsumg(MouseEvent event) throws IOException {
        FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/samsumg.fxml"));
       Parent root = loader.load();
       
       SamsumgController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
      controller.init(lbluser.getText(), stage, this);
       stage.show();
       this.stage.close();
        
    }

    @FXML
    private void viewventanaopenear(MouseEvent event) throws IOException {
         FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/openear.fxml"));
       Parent root = loader.load();
       
       OpenearController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
       controller.init(lbluser.getText(), stage, this);
       stage.show();
       this.stage.close();
    }

    @FXML
    private void viewventanaplaystation(MouseEvent event) throws IOException {
         FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/playstation.fxml"));
       Parent root = loader.load();
       
       PlaystationController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
       controller.init(lbluser.getText(), stage, this);
       stage.show();
       this.stage.close();
    }

    @FXML
    private void viewventanalaptop(MouseEvent event) throws IOException {
         FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/laptop.fxml"));
       Parent root = loader.load();
       
       LaptopController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
       controller.init(lbluser.getText(), stage, this);
       stage.show();
       this.stage.close();
    }

    @FXML
    private void viewcompraf(MouseEvent event) throws IOException {
        FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/Compra.fxml"));
       Parent root = loader.load();
       
       CompraController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
       controller.init(lbluser.getText(), stage, this);
       stage.show();
       this.stage.close();
    }
    
}
