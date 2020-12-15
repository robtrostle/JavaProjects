
package GUIS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;//imports all buttons
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override    //start is an abstract method
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("My Button!");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("This is now my button");
//            }
//        });
        RadioButton rb = new RadioButton("My Radio Button...");
        //root.getChildren().add(btn);
        //root.getChildren().add(rb);
        rb.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This is now my button");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(rb);
        
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
