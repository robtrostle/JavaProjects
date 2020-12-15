/*
Week 12 in class excercise. Future value = investment acount x (1 + monthly interest rate) 
to the power of years * 12
 */

package GUIS;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class InvestmentCalculator extends Application {
// Class instance variable for controls that can be shared. 
   private TextField txtInvestmentAmount = new TextField();
   private TextField txtNumberOfYears = new TextField();
   private TextField txtAnnualInterestRate = new TextField();
   private TextField txtFutureValue = new TextField();
   private Button btnCalculate = new Button("Calculate");
   private Button btnClear = new Button("Clear");
   private Button btnExit = new Button("Exit");
   
   
    public static void main(String[] args) {
        // launch 
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        
        BorderPane mainPane = new BorderPane();
        mainPane.setPadding(new Insets(15)); //put outside padding at 15px kind of like decoration
        mainPane.setStyle("-fx-background-color: antiquewhite");
        
        
        GridPane gridPane = new GridPane();
        //Set Visual Spacing within grid
        gridPane.setHgap(5); //5 pixels horizontal
        gridPane.setVgap(5); 
        gridPane.add(new Label("Investment amount:"), 0, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);//column 0 row 1
        gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
        gridPane.add(new Label("Future Value:"), 0, 3);
        //Add the boxes text feilds and the button on the end. 
        gridPane.add(txtInvestmentAmount, 1, 0);
        gridPane.add(txtNumberOfYears, 1, 1);
        gridPane.add(txtAnnualInterestRate, 1, 2);
        gridPane.add(txtFutureValue, 1, 3);
        gridPane.add(btnCalculate, 1, 4);
        //Set position of the grid
        gridPane.setAlignment(Pos.CENTER);
        txtFutureValue.setEditable(false); //don't allow to edit the future value txt feild
        
        //set up buttons in a flow pane
        btnCalculate.setPrefWidth(100);
        btnClear.setPrefWidth(75);
        btnExit.setPrefWidth(75);
        FlowPane buttonPane = new FlowPane(); // this is the default
        buttonPane.setHgap(5);
        buttonPane.setAlignment(Pos.CENTER_RIGHT);
        buttonPane.getChildren().addAll(btnCalculate, btnClear, btnExit);
        //build out the border pane
        Label lblTitle = new Label("Future Value Calculator");
        lblTitle.setStyle("-fx-font-size: 18pt; -fx-fpmt-weight: bold");
        mainPane.setTop(lblTitle);
        mainPane.setCenter(gridPane);
        mainPane.setBottom(buttonPane);
                
                // register event
        btnCalculate.setOnAction(e -> calculateFutureValue());
        btnClear.setOnAction(e -> {
        txtAnnualInterestRate.setText("");
        txtFutureValue.setText("");
        txtNumberOfYears.setText("");
        txtInvestmentAmount.setText("");
        });
        btnExit.setOnAction(e -> {
        primaryStage.close();
        });
        primaryStage.setOnCloseRequest(e -> System.out.println("Closing"));
        //Create scene and add to stage
        Scene scene = new Scene(mainPane, 400, 250); //400 wide 250 high
        primaryStage.setScene(scene);
        primaryStage.setTitle("Investment Calculator 2000");
        primaryStage.show();
    }
    //perform calc
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
        txtFutureValue.setText(String.format("$%,.2f", futureValue));
        } catch (NumberFormatException e){
            //inform user of problem
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Bad non-numeric input");
            alert.setContentText("Please enter only numeric values");
            
            alert.showAndWait();//invoke modal dialog. Freezes app until user dismisses dialog
        }
            
        
    }
}
