package investmentcalculatorapi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * @author Robert Trostle
 * This class is designed to allow the programmer to customize their calculator.
 * The user will 
 * 
 *  * Docs = API_InvestmentCalculator.docx
 */
public class API_InvestmentCalculator extends Application {
    // Class instance variable for controls that can be shared. 
   private TextField txtInvestmentAmount = new TextField();
   private TextField txtNumberOfYears = new TextField();
   private TextField txtAnnualInterestRate = new TextField();
   private Label lblFutureValue = new Label();
   private Button btnCalculate = new Button("Calculate");
   private Button btnClear = new Button("Clear");
   private Button btnExit = new Button("Exit");

    // To be overidden by demo class
    @Override
    public void start(Stage primaryStage) throws Exception{
    }
    /**
     * Creates scene of the given width & height. If either value is less
     * than 100 then the window will default to a size of 500 X 500
     *
     * @param bp BorderPane used in your app
     * @param w Desired WIDTH of the GUI
     * @param h Desired HEIGHT of the GUI
     * @return a Scene with desired Width & Height
     */
    public Scene makeScene(BorderPane bp, int w, int h) {
        int[] sizeArr = {w, h};

        if (w < 400 || h < 250) {
            System.err.println("Invalid height or width. Default size "
                    + "(400, 250) has been set");
            sizeArr[0] = 400;
            sizeArr[1] = 250;
        }
        Scene scene = new Scene(bp, sizeArr[0], sizeArr[1]);
        return scene;
    }
    /**
     * Sets the background of the window to the desired color
     *
     * @param bp BorderPane used in your app
     * @param color Desired color of the background (Use string version of fx colors("-fx-background-color: AQUAMARINE")
     * 
     */
    public void pickWindowColor(BorderPane bp, String color){
        bp.setStyle(color);
    }
    /**
     * Sets the text fields and labels on top of a gridpane which is placed 
     *on the borderPane (mainPane)
     * @param gp GridPane to be place on the main borderPane
     * @param bp BorderPane (mainPane) used in the app
     * 
     * 
     */
    public void setTextFields(GridPane gp, BorderPane bp){
        
        //Set Visual Spacing within grid
        gp.setHgap(5); //5 pixels horizontal
        gp.setVgap(5); 
        gp.add(new Label("Investment amount:"), 0, 0);
        gp.add(new Label("Number of Years:"), 0, 1);//column 0 row 1
        gp.add(new Label("Interest Rate (As Integer):"), 0, 2);
        gp.add(new Label("Future Value:"), 0, 3);
        //Add the boxes text feilds and label 
        gp.add(txtInvestmentAmount, 1, 0);
        gp.add(txtNumberOfYears, 1, 1);
        gp.add(txtAnnualInterestRate, 1, 2);
        gp.add(lblFutureValue, 1, 3);
        
        //Set position of the grid
        gp.setAlignment(Pos.CENTER);
        bp.setCenter(gp);
    }
    /**Overloaded
     * Sets the buttons and title for the program 
     *on the borderPane (mainPane)
     * @param mainPane BorderPane (mainPane) used in the app
     * @param gridPane GridPane to be place on the main borderPane
     * @param hb HBox for the buttons to be placed on
     * @param title String to hold the name of the title
     * @param font String to hold font type of the buttons
     * @param color String to hold color of the Calculate button
     */
    public void setButtons(BorderPane mainPane, GridPane gridPane, HBox hb, String title, String font, String color){
        //set up buttons in an Hbox
        btnCalculate.setPrefWidth(100);
        btnCalculate.setFont(Font.font(font, FontWeight.BOLD,
                FontPosture.REGULAR, 14));
        btnCalculate.setStyle(color);
        
        btnClear.setPrefWidth(75);
        btnClear.setFont(Font.font(font, FontWeight.NORMAL,
                FontPosture.REGULAR, 14));
        
        btnExit.setPrefWidth(75);
        btnExit.setFont(Font.font(font, FontWeight.NORMAL,
                FontPosture.REGULAR, 14));
        
        Label lblTitle = new Label(title);
        lblTitle.setStyle("-fx-font-size: 18pt; -fx-fpmt-weight: bold");
        lblTitle.setAlignment(Pos.CENTER);
        mainPane.setTop(lblTitle);
        
        hb.setPadding(new Insets(0, 20, 30, 20));//sets some padding for the buttons
        //3rd number is from the bottom. 
        hb.setAlignment(Pos.TOP_CENTER);
        hb.getChildren().addAll(btnCalculate, btnClear, btnExit);
        //build out the border pane
        mainPane.setBottom(hb);        
    }
    //perform calc
    /**
     * Sets the calculation method. Used in the executeButtons method
     *
     * @param void
     * 
     */
    private void calculateFutureValue(){
        // Get values from the text fields.
        String investment  = txtInvestmentAmount.getText();
        String interestRate = txtAnnualInterestRate.getText();
        String years = txtNumberOfYears.getText();
        
        // Convert to numeric values
        try {
        double investmentAmount = Double.parseDouble(investment);
        double interestRateValue = Double.parseDouble(interestRate);
        int yearsValue = Integer.parseInt(years);
        // calc future value
        double monthlyInterestRate = interestRateValue / 1200; //assume user will enter value like 2 or 5 
        double futureValue = 
                investmentAmount * Math.pow(1 + monthlyInterestRate, yearsValue * 12);
        
        // send value back to screen
        lblFutureValue.setText(String.format("$%,.2f", futureValue));
        lblFutureValue.setFont(javafx.scene.text.Font.font("Courier New", FontWeight.EXTRA_BOLD,
                FontPosture.REGULAR, 16));
        } catch (NumberFormatException e){
            //inform user of problem
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Bad non-numeric input");
            alert.setContentText("Please enter only numeric values");
            alert.showAndWait();//invoke modal dialog. Freezes app until user dismisses dialog
        }
    
    }
    /**
     * Gives action to the buttons and makes them work
     *
     * @param primaryStage Stage used to close properly for the exit button
     */
    public void executeButtons(Stage primaryStage){
        // register event
        btnCalculate.setOnAction(e -> calculateFutureValue());
        //set the clear button to force empty strings in text fields.
        btnClear.setOnAction(e -> {
        txtAnnualInterestRate.setText("");
        lblFutureValue.setText("");
        txtNumberOfYears.setText("");
        txtInvestmentAmount.setText("");
        });
        btnExit.setOnAction(e -> {
        primaryStage.close();
        });
        primaryStage.setOnCloseRequest(e -> System.out.println("Closing"));
    }
}


    
    
    

