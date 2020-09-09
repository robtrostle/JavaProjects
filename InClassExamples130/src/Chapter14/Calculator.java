
package Chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        
        //Set spacing between nodes 
        pane.setHgap(25);
        pane.setVgap(25);
        
        //Vbox
        VBox topBox = new VBox(15);//15 pixel of space
        topBox.setAlignment(Pos.CENTER);
        
        //Text 
        Text title = new Text(20,20, "Simple Calculator");
        title.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        
        //text field for our VBox
        TextField tf = new TextField();
        tf.setPrefWidth(300);
        tf.setPadding(new Insets(10,10,10,10));
        tf.setEditable(false);
        tf.setAlignment(Pos.CENTER);
        
        //Hbox 1 (first set of buttons)
        HBox hb1  = new HBox(15);
        hb1.setAlignment(Pos.CENTER);
        hb1.setScaleX(1.5);
        hb1.setScaleY(1.5);
        
        //Hbox 2 (first set of buttons)
        HBox hb2  = new HBox(15);
        hb2.setAlignment(Pos.CENTER);
        hb2.setScaleX(1.5);
        hb2.setScaleY(1.5);
        
        //Hbox 3 (first set of buttons)
        HBox hb3  = new HBox(15);
        hb3.setAlignment(Pos.CENTER);
        hb3.setScaleX(1);
        hb3.setScaleY(1);
        
        //Hbox 4 (first set of buttons)
        HBox hb4  = new HBox(15);
        hb4.setAlignment(Pos.CENTER);     
        hb4.setScaleY(1.25);
        
        //Hbox 5 (calc and clear)
        HBox hb5  = new HBox(15);
        hb5.setAlignment(Pos.CENTER);
        hb5.setScaleX(1.5);
        hb5.setScaleY(1.5);
        
        
        
        //Buttons
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button dec = new Button(".");
        
        Button bClear = new Button("Clear");
        Button bCalc = new Button("Calc");
              
        //Add nodes to the pane
        pane.add(topBox, 0, 0);
        topBox.getChildren().add(title);
        topBox.getChildren().add(tf);
        
        //Add buttons to H1
        pane.add(hb1, 0, 1);
        hb1.getChildren().add(b1);
        hb1.getChildren().add(b2);
        hb1.getChildren().add(b3);
        
        //Add buttons to H2
        pane.add(hb2, 0, 2);
        hb2.getChildren().addAll(b4,b5,b6);
        
        pane.add(hb3, 0, 3);
        hb3.getChildren().addAll(b7,b8,b9);
        
        //Add buttons to h4
        pane.add(hb4, 0, 4);
        hb4.getChildren().add(add);//add button
        hb4.getChildren().add(sub);//
        hb4.getChildren().add(b0);//
        b0.setScaleY(1.5);
        b0.setScaleX(1.5);   
        hb4.getChildren().add(mul);//
        hb4.getChildren().add(div);//
        hb4.getChildren().add(dec);//
        
        //Add buttons to h5
        pane.add(hb5, 0, 5);
        hb5.getChildren().addAll(bClear, bCalc);
        
        //add color and style to buttons
        bClear.setStyle("-fx-background-color : red");
        bCalc.setStyle("-fx-background-color : #90ee90");
              
        //Set the scene and stage
        Scene scene = new Scene(pane);
        primaryStage.setWidth(500);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
