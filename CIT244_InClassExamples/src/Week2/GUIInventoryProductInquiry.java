/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIInventoryProductInquiry extends Application
{
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    DataInputStream inputRecord;  
    // Use ArrayList to store Inventory product objects
    ArrayList<InventoryProduct> records;
    
    // Radio buttons determine which items show up in table view
    RadioButton rbAll;
    RadioButton rbLess75Inventory;
    RadioButton rbGreater75Inventory;
    RadioButton rbGreater250Value;
    
    // Displays InventoryProducts
    TableView<InventoryProduct> tableView;
    
    
    
    public static ArrayList<InventoryProduct> readInventoryProductRecords()
    { 
        // Define a programmer-defined variable to hold input data
        // Change location of project and txt file
        boolean endOfFile;
        endOfFile = false;
        ArrayList<InventoryProduct> records = new ArrayList<InventoryProduct>();
        
        try
        {
            DataInputStream inputRecord = new DataInputStream(new FileInputStream
                    ("/Users/christinatrostle/Desktop/AnotherExample.txt"));
          
            while (!endOfFile)
            {                  
                InventoryProduct inventoryProductRecord = new InventoryProduct();

                inventoryProductRecord.setInventoryProductNumber(inputRecord.
                        readInt());
                inventoryProductRecord.setInventoryProductDescription(inputRecord.
                        readUTF());
                inventoryProductRecord.setInventoryProductPrice(inputRecord.
                        readDouble());
                inventoryProductRecord.setInventoryQuantityOnHand(inputRecord.
                        readInt());
                inventoryProductRecord.setInventoryQuantityOnOrder(inputRecord.
                        readInt());
                inventoryProductRecord.setInventoryQuantitySold(inputRecord.
                        readInt());

                records.add(inventoryProductRecord);
            } // end of while 
        }  
        
        catch (EOFException e) 
        {
               System.out.println("End of Reading the File");
        }
        
        catch (IOException e) 
        {
               System.out.println("IO Exception");
               System.exit(1);
        }
        
        return records;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        records = readInventoryProductRecords();
        
        // Top row
        // Create label Display
        Label displayLabel = new Label("Display: ");
        
        // Second row
        // Define radio buttons
        rbAll = new RadioButton("All records");
        rbLess75Inventory = new RadioButton("Current Inventory <= 75");
        rbGreater75Inventory = new RadioButton("Current Inventory > 75");
        rbGreater250Value = new RadioButton("Value > $250");
        
        ToggleGroup group = new ToggleGroup();
        
        rbAll.setToggleGroup(group);
        rbLess75Inventory.setToggleGroup(group);
        rbGreater75Inventory.setToggleGroup(group);
        rbGreater250Value.setToggleGroup(group);
        
        rbAll.setSelected(true);
        
        // Define horizontal box to store radio buttons
        HBox space = new HBox();
        HBox rbRow = new HBox(rbAll, rbLess75Inventory, rbGreater75Inventory, 
                rbGreater250Value);
        HBox.setHgrow(space, Priority.ALWAYS);
        rbRow.setSpacing(10);
        
        // Third row: table view
        // Define TableView that display Inventory Products
        tableView = new TableView<InventoryProduct>();
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        // Define columns of the Table view that interface with 
        // the Inventory Product class
        TableColumn<InventoryProduct, Integer> idColumn = 
                new TableColumn<InventoryProduct, Integer>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Integer>("inventoryProductNumber"));
        idColumn.setPrefWidth(40);
        
        TableColumn<InventoryProduct, String> descriptionColumn = 
                new TableColumn<InventoryProduct, String>("Description");
        descriptionColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, String>("inventoryProductDescription"));
        
        descriptionColumn.setPrefWidth(125);
        
        TableColumn<InventoryProduct, Double> priceColumn = 
                new TableColumn<InventoryProduct, Double>("Price");
        priceColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Double>("inventoryProductPriceFormatted"));
        
        TableColumn<InventoryProduct, Integer> numOnHandColumn = 
                new TableColumn<InventoryProduct, Integer>("# On Hand");
        numOnHandColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Integer>("inventoryQuantityOnHand"));
        
        TableColumn<InventoryProduct, Integer> numOnOrderColumn = 
                new TableColumn<InventoryProduct, Integer>("# On Order");
        numOnOrderColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Integer>("inventoryQuantityOnOrder"));
        
        TableColumn<InventoryProduct, Integer> numSoldColumn = 
                new TableColumn<InventoryProduct, Integer>("# Sold");
        numSoldColumn.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Integer>("inventoryQuantitySold"));
        
        TableColumn<InventoryProduct, Integer> currentInventory = 
                new TableColumn<InventoryProduct, Integer>("Current Inventory");
        currentInventory.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Integer>("currentProductInventory"));
 
        TableColumn<InventoryProduct, Double> dollarValueInventory = 
                new TableColumn<InventoryProduct, Double>("Dollar Value");
        dollarValueInventory.setCellValueFactory(new PropertyValueFactory
                <InventoryProduct, Double>("dollarValueInventoryFormatted"));
        
        currentInventory.setPrefWidth(125);
        dollarValueInventory.setPrefWidth(125);
        
        // Add columns to the TableView
        tableView.getColumns().add(idColumn);
        tableView.getColumns().add(descriptionColumn);
        tableView.getColumns().add(priceColumn);
        tableView.getColumns().add(numOnHandColumn);
        tableView.getColumns().add(numOnOrderColumn);
        tableView.getColumns().add(numSoldColumn);
        tableView.getColumns().add(currentInventory);
        tableView.getColumns().add(dollarValueInventory);
        
        tableView.setPrefSize(736, 400);
        
        // Fourth row
        // Define exit button that ends the program
        
        Button bExit = new Button("Exit");
        HBox bExitBox = new HBox(bExit);
        bExitBox.setAlignment(Pos.CENTER_RIGHT);
        
        // Displaying all the controls withing VBox container
        VBox container = new VBox(displayLabel, rbRow, tableView, bExitBox);
        container.setStyle("-fx-padding: 20px;");
        container.setSpacing(20);
        
        // Set the action listeners - Exit Button and RadioButtons
        // Highlight calculate buttons when selected
        bExit.setOnAction(e -> {
            System.exit(0);
        });
        rbAll.setOnAction(e -> {
            dollarValueInventory.setStyle(null);
            currentInventory.setStyle(null);
            refreshTableView();
        });
        rbLess75Inventory.setOnAction(e -> {
            dollarValueInventory.setStyle(null);
            currentInventory.setStyle("-fx-background-color: transparent");
            refreshTableView();
            currentInventory.setStyle("-fx-base: palegreen;");
        });
        rbGreater75Inventory.setOnAction(e -> {
            dollarValueInventory.setStyle(null);
            currentInventory.setStyle(null);
            refreshTableView();
            currentInventory.setStyle("-fx-base: palegreen;");
        });
        rbGreater250Value.setOnAction(e -> {
            currentInventory.setStyle(null);
            refreshTableView();
            dollarValueInventory.setStyle("-fx-base: palegreen;");
        });
        
        // Create a scene and place it in the stage
        primaryStage.setScene(new Scene(container));
        primaryStage.setTitle("Co. Inventory");
        primaryStage.sizeToScene();
        primaryStage.show();

        refreshTableView();
    }
    
    // Invoke all action events
    private void refreshTableView() {
        ObservableList<InventoryProduct> items = tableView.getItems();
        items.clear();
        
        for (InventoryProduct r : records) {
            // Show all of the inventory product data file records
            if (rbAll.isSelected()) {
                items.add(r);
            // Show all record with the current product inventory <= 75
            } else if (rbLess75Inventory.isSelected() && 
                    r.getCurrentProductInventory() <= 75) {
                items.add(r);
            // Show all record with the current product inventory > 75
            } else if (rbGreater75Inventory.isSelected() && 
                    r.getCurrentProductInventory() >= 75) {
                items.add(r);
            // Show all of the records with the dollar value greater than $250
            } else if (rbGreater250Value.isSelected() && 
                    r.getDollarValueInventory() >= 250) {
                items.add(r);
            }
        }
    }
}// End of the class                  

