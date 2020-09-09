
package Chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class SpongeBobButtons2 extends Application{
    
    @Override
    public void start(Stage primaryStage){
        //create a pane to hold the image views
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(15,15,15,15));
        
        //Add hbox & vbox
        HBox hb = new HBox();
        VBox vb = new VBox();
        
        //Text object for the title
        Text title = new Text("Spong Bob Buttons");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        
        //load images
        Image spongebob = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/SpongeBob_SquarePants_character.svg/1200px-SpongeBob_SquarePants_character.svg.png",100,100,false,false);
        Image patrick = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1200px-Patrick_Star.svg.png",100,100,false,false);
        Image plankton = new Image("https://www.nicepng.com/png/detail/463-4635353_download-spongebob-squarepants-characters-clipart-plankton-sheldon-j.png",100,100,false,false);
        Image squidward = new Image("https://vignette.wikia.nocookie.net/nickelodeon/images/e/ea/Squidward_in_2018.png/revision/latest/top-crop/width/360/height/360?cb=20190227183729",100,100,false,false);
        Image krab = new Image("https://vignette.wikia.nocookie.net/spongebob/images/7/7b/Krabs_artwork.png/revision/latest?cb=20181201224233",100,100,false,false);
        //Make the buttons the images will sit on. 
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        
        Button b5_1 = new Button();
        b5_1.setGraphic(new ImageView(krab));
        Button b5_2 = new Button();
        b5_2.setGraphic(new ImageView(krab));
        
        //Add the notdes to the pane
        pane.setCenter(b1);
        b1.setGraphic(new ImageView(spongebob));
        
        pane.setLeft(b2);
        b2.setGraphic(new ImageView(patrick));
        
        pane.setRight(b3);
        b3.setGraphic(new ImageView(plankton));
        
        pane.setTop(b4);
        b4.setGraphic(new ImageView(squidward));
        BorderPane.setAlignment(b4, Pos.TOP_CENTER);
        
        pane.setBottom(b5);
        b5.setGraphic(new ImageView(krab));
        BorderPane.setAlignment(b5, Pos.BOTTOM_CENTER);
        
        //Add the Vox to the pane
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(title, b4);//Add the title and button 4, which is squid. 
        pane.setTop(vb);
        //Add the Hbox to the pane
        hb.getChildren().addAll(b5, b5_1, b5_2);
        pane.setBottom(hb);
        
        //Create a scene and place it in the stage. 
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Sponge Bob Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
