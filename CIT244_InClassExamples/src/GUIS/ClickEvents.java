package GUIS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ClickEvents extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("0");
        Label label2 = new Label("2");
        
        Button btn = new Button("Click");
        Button btn2 = new Button("Even Click");
 
        btn.setText("Click Counter");
        btn2.setText("Even Click Counter");
        

        btn.setOnAction(new ClickHandler(label));
        btn2.setOnAction(new ClickHandler(label2));
            

        //Add the label and buttons to a pane
        BorderPane bp = new BorderPane();
        VBox pane = new VBox(10);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(label,label2,btn,btn2);
        
        //Set up the stage
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Clickie!");
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
