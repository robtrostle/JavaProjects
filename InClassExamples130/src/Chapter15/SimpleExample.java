
package Chapter15;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class SimpleExample extends Application{

    @Override
    public void start(Stage primaryStage){
        //Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        
        //Button 
        Button b = new Button("Button");
        
        String[] words = {"Example", "Something","Why","Are","You","Clicking",
            "Me"};

        //lambda
        b.setOnAction((ActionEvent e ) -> {
            System.out.println("Button pressed");
            System.out.println((int)(Math.random() * words.length));
            b.setText(words[(int)(Math.random() * words.length)]);
    });
        
        pane.add(b,1,0);
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.setTitle("Changing Button Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
