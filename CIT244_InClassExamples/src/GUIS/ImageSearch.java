
package GUIS;

import Jwiki.Jwiki;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ImageSearch extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane bp = new BorderPane();
        
        //search bar
        TextField tf = new TextField();
        //title
        Label title = new Label("Search for an image");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        
        //Search Button
        Button searchB = new Button("Search");
        tf.setPrefWidth(50);//if the scen is big enough to have a button width of 50, it will, otherwise it will shrink down
        searchB.setPrefWidth(100);
        
        //Lambda | Button Functionality
        searchB.setOnAction((ActionEvent) -> {
            String search = tf.getText();
            System.out.println("Searching for " + search);
            setTitle(tf, title);
            //set the image
            bp.setCenter(setImage(search));
            tf.setText("");//resets the text field to an empty string
            tf.requestFocus();//forces cursor to stay in the text field after clearing. 
        });
        //Container for the title, search bar & button
        VBox vb = new VBox(10);
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(title, tf, searchB);
        
        bp.setTop(vb);
        
        Scene scene = new Scene(bp, 500, 500);
        
        primaryStage.setTitle("Image Search!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
//this method will set the title to the searched text
    public static void setTitle(TextField tf, Label title){
        //if textfiled is left blank, place the kitten text
        if(tf.getText().length()==0){
            title.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
            title.setTextFill(Color.RED);
            title.setText("If you don't anything, you get a kitten!");
        }//otherwise, place the users searched text
        else{
            title.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 25));
            title.setText(tf.getText());//will set the title to the text field.
        }
    }
    public static ImageView setImage(String search){
        
        Color[] colors = {Color.BLACK, Color.BLUE, Color.AZURE, Color.RED, Color.GREENYELLOW, Color.CHOCOLATE,
        Color.FUCHSIA, Color.HOTPINK, Color.OLIVEDRAB, Color.TOMATO};
        int random = (int)(Math.random() * colors.length);
        DropShadow ds = new DropShadow(500, colors[random]);
        
        String imgUrl;
        try{//to to find the image based on the search
            Jwiki jwiki = new Jwiki(search);
            imgUrl = jwiki.getImageURL();
        }
        catch(Exception e){
            System.err.println(search + " was not found, here is a kitten instead.");
            imgUrl = "https://images.squarespace-cdn.com/content/v1/582d50986b8f5ba33e73b9c8/1526950762437-USL0U2LQPNL2YQ53XXKO/ke17ZwdGBToddI8pDm48kFWxnDtCdRm2WA9rXcwtIYR7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1Uf_TT3g97i6_XmO-qcQt4zAfXqdI_5B_HjrxMT8d5xsm3WUfc_ZsVm9Mi1E6FasEnQ/Abby+kitten.png?format=2500w";
        }
        Image img = new Image(imgUrl, 250, 250, false, false);
        ImageView imgv = new ImageView(img);
        imgv.setEffect(ds);
        return imgv;
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}
