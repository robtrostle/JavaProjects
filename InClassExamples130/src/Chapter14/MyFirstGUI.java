
package Chapter14;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.*;

public class MyFirstGUI extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        
        pane.setHgap(10);
        pane.setVgap(25);
        
        //create nodes
        //Text field
        TextField tf = new TextField();
        tf.setPrefWidth(150);
        
        //Button
        Button b = new Button("BUTTON");
        
        //text
        Text t = new Text("Example Check Box: ");
        
        //Checkbox
        CheckBox cb = new CheckBox();
        
        //load nodes into the pane
        pane.add(tf, 0, 0);
        pane.add(b, 1, 0);
        pane.add(t, 0, 1);
        pane.add(cb, 1, 1);
        
        //Creat a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setWidth(300);
        primaryStage.setHeight(150);
        primaryStage.setTitle("My First GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
