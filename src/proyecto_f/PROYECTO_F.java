/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_f;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author Brian
 */
public class PROYECTO_F extends Application{
public void start(Stage primaryStage) throws IOException {
        
        
       Parent root = FXMLLoader.load(getClass().getResource("Loginn.fxml"));

       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}




    

    /**
     * @param args the command line arguments
     */
    
    

