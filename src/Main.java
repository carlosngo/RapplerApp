/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import javafx.*;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Carlos
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
//        StackPane root = new StackPane();
        
        URL url = getClass().getClassLoader().getResource("/View/SampleFXML.fxml");
//        System.out.println(url);
//        System.out.println(getClass().getResource("../../src/View/SampleFXML.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("C:\\Users\\Carlos\\Documents\\GitHub\\RapplerApp\\src\\View\\Login_Page.fxml"));
        StackPane root = loader.load();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
