package GUIS;

// Java Program to create a color picker and add it to the stage 
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.collections.*; 
import javafx.stage.Stage; 
import javafx.scene.text.Text.*; 
import javafx.scene.paint.*; 
import javafx.scene.text.*; 
public class ColorPick extends Application { 
    // labels 
    Label l; 
    
    public static void main(String args[])  { 
        // launch the application 
        launch(args); 
    } 
  
    // launch the application 
    public void start(Stage s) 
    { 
        // set title for the stage 
        s.setTitle("Creating color picker"); 
  
        // create a tile pane 
        TilePane r = new TilePane(); 
  
        // create a label 
        l = new Label("This is a color picker example "); 
  
        // create a color picker 
        ColorPicker cp = new ColorPicker(Color.BLUE); 

        // add label 
        r.getChildren().add(l); 
        r.getChildren().add(cp); 
  
        // create a scene 
        Scene sc = new Scene(r, 200, 200); 
  
        // set the scene 
        s.setScene(sc); 
  
        s.show(); 
    } 
  
    
} 