
package GUIS;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class RunningTemps extends Application {
    
    @Override    //start is an abstract method
    public void start(Stage primaryStage) {

        BorderPane bp = new BorderPane();
        
        //top
        Label title = new Label("Running Clothing\nBy Temperature:");
        title.setFont(Font.font("Book Antiqua", FontWeight.BOLD, FontPosture.REGULAR, 35));
        BorderPane.setAlignment(title, Pos.CENTER);
        bp.setTop(title);
        
        //Center
        bp.setCenter(null);
        
        //Bottom
        Label cLabel = new Label("Celcius");
        Label fLabel = new Label("Fahrenheit");
        
        Slider cSlider = tSlider(-20,40);
        Slider fSlider = tSlider(0,100);
        
        // Moves F when we move C
        cSlider.valueProperty().addListener((ObservableValue <? extends Number >  
                observable, Number oldValue, Number newValue) -> {
            fSlider.setValue((cSlider.getValue() * (9.0 / 5.0)) + 32);
        });
        // Moves C when we move F
      fSlider.valueProperty().addListener((ObservableValue <? extends Number >  
              observable, Number oldValue, Number newValue) -> {
          cSlider.setValue((fSlider.getValue() - 32) * (5.0 / 9.0));
          
          // Get background color
            if(fSlider.getValue() < 25) {
                bp.setStyle("-fx-background-color: #66ccff;");  
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415384630-20-24.jpg?"));
            }
            else if(fSlider.getValue() >= 25 && fSlider.getValue() <= 29) {
                bp.setStyle("-fx-background-color: #99ccff");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415384375-25-29.jpg"));
            }
            else if(fSlider.getValue() >= 30 && fSlider.getValue() <= 34) {
                bp.setStyle("-fx-background-color: #33ccff");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415384015-30-34-2.jpg?"));
            }
            else if(fSlider.getValue() >= 35 && fSlider.getValue() <= 39) {
                bp.setStyle("-fx-background-color: #6666ff;");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415383397-35-39.jpg?"));
            }
            else if(fSlider.getValue() >= 40 && fSlider.getValue() <= 44) {
                bp.setStyle("-fx-background-color: #ff99ff");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415383283-40-44-3.jpg?"));
            }
            else if(fSlider.getValue() >= 45 && fSlider.getValue() <= 49) {
                bp.setStyle("-fx-background-color: #ff9999");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381871-45-49.jpg?"));
            }
            else if(fSlider.getValue() >= 50 && fSlider.getValue() <= 54) {
                bp.setStyle("-fx-background-color: #ff9966");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381835-50-54.jpg?"));
            }
            else if(fSlider.getValue() >= 55 && fSlider.getValue() <= 59) {
                bp.setStyle("-fx-background-color: #ff9933");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381795-55-59.jpg?"));
            }
            else if(fSlider.getValue() >= 60 && fSlider.getValue() <= 69) {
                bp.setStyle("-fx-background-color: #ff6600");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381732-60-69.jpg?"));
            }
            else if(fSlider.getValue() >= 70 && fSlider.getValue() <= 79) {
                bp.setStyle("-fx-background-color: #cc6600");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381662-70-79.jpg?"));
            }
            else if(fSlider.getValue() >= 80) {
                bp.setStyle("-fx-background-color: #ff3300");
                bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415382046-80correct.jpg?"));
            }
      });
          
            
        
        //create a vertical box to store bottom nodes
        VBox bot = new VBox(10);
        bot.getChildren().addAll(cLabel, cSlider, fLabel, fSlider);
        bot.setAlignment(Pos.CENTER);
        bp.setBottom(bot);
        
        
        
        Scene scene = new Scene(bp, 650, 650);
        
        primaryStage.setTitle("Runner Clothing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static Slider tSlider(int min, int max)
    {
        Slider slider = new Slider();
        slider.setMin(min);
        slider.setMax(max);
        
        slider.setMajorTickUnit(10);
        //enable tick lables and tick marks
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        
        return slider;
    }
    public static ImageView getImg(String s) {
        Image img = new Image(s, 650, 200, false, false);
        ImageView imgv = new ImageView(img);
        
        return imgv;
    }
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
