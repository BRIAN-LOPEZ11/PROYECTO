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
    public void start(Stage primaryStage) {

        Label labelTitulo = new Label("LOGIN");
        labelTitulo.setFont(new Font(30));
        
        Label labelUsuario = new Label("USUARIO");
        labelUsuario.setFont(new Font(15));
        
        Label labelContraseña = new Label("CONTRASEÑA");
        labelContraseña.setFont(new Font(15));

        TextField textUsuario = new TextField();
        textUsuario.setMaxWidth(150);
        
        PasswordField textcontraseña = new PasswordField();
        textcontraseña.setMaxWidth(150);

        Button btnlogin = new Button("ENTRAR");
        btnlogin.setMaxWidth(150);
        btnlogin.setCursor(Cursor.HAND);
        
        
        VBox root = new VBox();
        root.getChildren().addAll(labelTitulo,labelUsuario,textUsuario,labelContraseña,textcontraseña,btnlogin);
        root.setAlignment(Pos.CENTER);


        

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("TECNOLOGY UNLIMITED");

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
