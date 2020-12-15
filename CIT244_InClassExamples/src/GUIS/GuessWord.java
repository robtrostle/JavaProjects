package GUIS;
import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * 
 * @author James Winyard
 */

public class GuessWord extends Application {

    private static String currentWord = "";//to hold the current word being guessed
    private static TextField[] tfs;//array of text fields
    private static int points = 0;
    private static Label pointsLabel;
    private static Label hintLabel;

    @Override
    public void start(Stage primaryStage) {

        Button newWordButton = new Button();
        newWordButton.setText("NEW WORD");
        newWordButton.setStyle("-fx-background-color: #ADD8E6;");

        Button guessButton = new Button();
        guessButton.setText("GUESS");
        guessButton.setStyle("-fx-background-color: #32CD32;");

        BorderPane bp = new BorderPane();
        GridPane gp = wordBoxes();

        // Top box
        VBox top = new VBox(5);
        
        HBox top1 = new HBox(10);
        Label scoreLabel = new Label("Score: ");
        scoreLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD,
                FontPosture.REGULAR, 50));
        pointsLabel = new Label(points + "");//concatenating an int onto empty string will make this possible. 
        pointsLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD,//This makes it appear to be one cohesive label even through theyr'e not
                FontPosture.REGULAR, 50));
//add two labels to the hbox
        top1.getChildren().addAll(scoreLabel, pointsLabel);
        top.setAlignment(Pos.CENTER);
        top1.setAlignment(Pos.CENTER);

        // Hint labels
        hintLabel = new Label(getHint(currentWord));
        hintLabel.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL,
                FontPosture.ITALIC, 25));
                //Add the two labels to the top of the borderpane
        top.getChildren().addAll(top1);
        top.getChildren().add(hintLabel);

        bp.setTop(top);
        //Center
        bp.setCenter(gp);
        
        // Button functionality - lambda for the new word
        newWordButton.setOnAction((ActionEvent e) -> {
            bp.setCenter(wordBoxes());//setting the center of our borderPane to be wordBoxes
            hintLabel.setText(getHint(currentWord));//call guess hint, passing current word 
        });
        //lambda for the guess button
        guessButton.setOnAction((ActionEvent e) -> {
            guessWord(currentWord);
        });
        
        //Hbox to store buttons
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(newWordButton, guessButton);
        bp.setBottom(hb);

        Scene scene = new Scene(bp, 500, 250);

        primaryStage.setTitle("Guess The Word!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static GridPane wordBoxes() {
        String[] words = {"APPLE", "CAT", "NO", "PROGRAMMER", "USA", "STEELERS"};
        int r = (int) (Math.random() * words.length);
        int size = words[r].length();

        tfs = new TextField[size];//re-initialize the text field array to be size of the words array. 
        currentWord = words[r];//assign the current word to be index of word array. currentWord is global

        GridPane gp = new GridPane();
        //add functionality to the text fields
        for (int i = 0; i < size; i++) {
            tfs[i] = new TextField();//generates a new text field 
            gp.add(tfs[i], i, 0);//adding into the gridpane, i == column. row == 0
            gp.setPrefWidth(5);
            tfs[i].setPrefHeight(50);
            tfs[i].setFont(Font.font("Arial", FontWeight.BOLD,
                    FontPosture.REGULAR, 20));
        }

        return gp;
    }

    public static void guessWord(String cWord) {

        int count = 0;
        //iterate through the current textfield (length of currentword)
        for (int i = 0; i < cWord.length(); i++) {

            try {
                // If the input at pos i == the word at that char keep it
                if (tfs[i].getText().toUpperCase().charAt(0) == cWord.charAt(i)) {
                    tfs[i].setStyle("-fx-background-color: #98FB98;");
                    count++;
                } else {
                    //tfs[i].setText(""); // Empty text field
                    tfs[i].setStyle("-fx-background-color: #ffcccb;");
                }
            } catch (Exception e) {
                System.err.println("Please complete the word.");
            }
        }

        if (count == cWord.length()) {
            System.out.println("Winner!");
            points++;
            pointsLabel.setText(points + "");
            pointsLabel.setStyle("-fx-text-fill: #3CB371;"); // FONT COLOR

        } else {
            System.out.println("Still " + (cWord.length() - count)
                    + " letters to go.");
        }
    }

    public static String getHint(String word) {

        String hint;

        switch (word) {
            case "APPLE":
                hint = "The \"A\" fruit";
                break;
            case "CAT":
                hint = "It goes \"Meow\"";
                break;
            case "NO":
                hint = "The oppisite of yes";
                break;
            case "PROGRAMMER":
                hint = "If you complete this class you can call yourself a computer ... ?";
                break;
            case "USA":
                hint = "You reside in the";
                break;
            case "STEELERS":
                hint = "Pittsburgh Football Team";
                break;
            default:
                hint = "N/A";
                break;
        }

        return hint;
    }

    public static void main(String[] args) {
        launch(args);

    }

}