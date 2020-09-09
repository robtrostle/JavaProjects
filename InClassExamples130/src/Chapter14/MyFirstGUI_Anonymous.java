
package Chapter14;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.*;

public class MyFirstGUI_Anonymous extends Application{

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
        
        
        //Anonymous function/handler passing a class as an argument
        //it's a class without an name. All in one step. 
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){             
                System.out.println("OK button clicked");
            }
        });
        
        //text
        Text t = new Text("Example Check Box: ");
        
        //Checkbox
        CheckBox cb = new CheckBox();
        
        
        cb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){             
                System.out.println("CB clicked");
            }
        });
        
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
//End class here
//start new outer class
//    class CheckBoxHandler implements EventHandler<ActionEvent>{
//        static int count = 2;
//        @Override
//        public void handle(ActionEvent event) {
//            if(count % 2 == 0){
//            System.out.println("Box has been checked");
//            }else{
//                    System.out.println("Check bot has been unchecked.");
//                    }count++;
//    }
//    
//}
    


