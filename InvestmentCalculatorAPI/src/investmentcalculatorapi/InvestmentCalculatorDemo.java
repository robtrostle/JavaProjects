package investmentcalculatorapi; 

import java.util.HashSet;
import java.util.Set;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

/**
 * @author Robert Trostle

 * Lines for programmer to change are labeled with TODO:
 * Uncomment code in the Start method & use calc. following the API to
 * customize your own investment calculator
 */

public class InvestmentCalculatorDemo extends API_InvestmentCalculator{

    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // To access methods of the API use calc.
        API_InvestmentCalculator calc = new API_InvestmentCalculator();
        //establishing our panes to be passed to method calls.
        BorderPane mainPane = new BorderPane();
        GridPane gp = new GridPane();
        FlowPane fp = new FlowPane();
        HBox hb = new HBox(10);//Gives borders to button. 

        // TODO: make scene - calc.makeScene() pass to it the mainPane and
        //your desire size in integers (width, height). Size will default to recommended size of 
        //400 wide 250 high but you can go bigger. 
        //Scene scene = calc
        //Feel free to run the program a this point to see if you like the size
        
        // TODO: Background color - calc.pickColor() pass to it
        // your background color: Ex: "-fx-background-color: antiquewhite"
        // Pass in the mainPane and the string version of fx colors. 
        // Click here for 
        //a list of the colors: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/Color.html
        //calc.pickWindowColor(mainPane, "");
        //Feel free to run the program a this point to see if you like the color
        
        // Set Text Fields and labels - calc.setTextFields
        // TODO: Create the text fields for user to type values in
        //calc

        // TODO: Set up the buttons and pick a title
        //- calc.setButtons() pass to it the mainPane, GribPane(gp), HBox(hb), 
        //String for the title, String for the font of buttons click here:
        //https://www.w3schools.com/cssref/css_websafe_fonts.asp for a list of 
        //font examples (eg "Comic Sans", "Courier New", "Book Antiqua")
        //and String for the color of the Background color (eg. "-fx-background-color: #FF0000")
        //click here: https://colorschemedesigner.com/csd-3.5/ for numerical fx colors.
        //Hover over your favorite color and copy the color code. 
        //calc.setButtons(mainPane,gp,hb,"","", "");
        
        // TODO: Call the execute buttons method which will give buttons functionality
        //calc.executeButtons() need to pass the primary stage for the exit button.
        //calc
        
        //Change the title of the window below
        primaryStage.setTitle("");
        
        //Setting up the scene
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    
}
