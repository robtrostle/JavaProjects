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

public class GuessWordCursorMovement extends Application {

    private static String currentWord = "";
    private static TextField[] tfs;
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
        pointsLabel = new Label(points + "");
        pointsLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD,
                FontPosture.REGULAR, 50));

        top1.getChildren().addAll(scoreLabel, pointsLabel);
        top.setAlignment(Pos.CENTER);
        top1.setAlignment(Pos.CENTER);

        // Hint
        hintLabel = new Label(getHint(currentWord));
        hintLabel.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL,
                FontPosture.ITALIC, 25));

        top.getChildren().addAll(top1);
        top.getChildren().add(hintLabel);

        bp.setTop(top);

        bp.setCenter(gp);

        // Button functionality
        newWordButton.setOnAction((ActionEvent e) -> {
            bp.setCenter(wordBoxes());
            hintLabel.setText(getHint(currentWord));
        });

        guessButton.setOnAction((ActionEvent e) -> {
            guessWord(currentWord);
        });

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

        tfs = new TextField[size];
        currentWord = words[r];

        GridPane gp = new GridPane();

        for (int i = 0; i < size; i++) {
            tfs[i] = new TextField();
            gp.add(tfs[i], i, 0);
            gp.setPrefWidth(5);
            tfs[i].setPrefHeight(50);
            tfs[i].setFont(Font.font("Arial", FontWeight.BOLD,
                    FontPosture.REGULAR, 20));

            tfs[i].setOnKeyPressed(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent ke) {
                    System.out.println("Key Pressed: " + ke.getText());
                    final TextField t[] = tfs;
                    moveUp(t);
                }
            });
        }

        return gp;
    }

    public static void guessWord(String cWord) {

        int count = 0;

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
                hint = "It gooes \"Meow\"";
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

    // Currently does not allow for letters to be changed (Must press new word to restart)
    public static void moveUp(TextField[] tfs) {
        
        for (int i = 0; i < tfs.length; i++) {

            if(!tfs[i].getText().equals("")) {
                System.out.println("Current space is filled so moving up.");
                tfs[i+1].requestFocus();
                System.out.println(i);
            }
            else {
                break;
            }
                
        }

    }

    public static void main(String[] args) {
        launch(args);

    }

}