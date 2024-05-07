/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_f;

import controllers.LoginController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Brian
 */
public class PROYECTO_F extends Application {

      
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
       FXMLLoader loader  = new FXMLLoader(getClass().getResource("/views/login.fxml"));
       Parent root = loader.load();
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       LoginController controller = loader.getController();
       controller.setStage(primaryStage);
       primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

/**
 * @param args the command line arguments
 */
