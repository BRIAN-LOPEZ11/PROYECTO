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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class LoginController implements Initializable {

    Stage stage;

    

    @FXML
    private TextField txtuser;
    @FXML
    private AnchorPane mine;
    @FXML
    private PasswordField txtcontra;
    @FXML
    private Button btnlogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void showWindow2(ActionEvent event) throws IOException {
       
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/carrito.fxml"));
                Parent root = loader.load();

                CarritoController controller = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                controller.init(txtuser.getText(), stage, this);
                stage.show();
                this.stage.close();
           
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    void show() {
        stage.show();
    }

    @FXML
    private void viewregistro(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/RegistroSB.fxml"));
        Parent root = loader.load();

        RegistroSBController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(txtuser.getText(), stage, this);
        stage.show();
        this.stage.close();
    }

}
