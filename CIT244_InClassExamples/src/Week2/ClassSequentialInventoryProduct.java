/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassSequentialInventoryProduct {
    static DataInputStream  inputRecord;
    
    static DataOutputStream outputRecord;
    
    public static DataInputStream openTheFileInputStream(DataInputStream 
            inputRecord)     
    {
        // Define the DataInputStream 
        try
        {
            inputRecord = new DataInputStream(new FileInputStream("/Users"
                    + "/christinatrostle/Desktop/AnotherExample.txt"));
        }
        catch (SecurityException securityError)
        {
            System.out.println("Security Exception Error " + securityError);
            System.exit(1);
        }
        catch (IOException ioExceptionError)
        {
            System.out.println("IO Exception Error " + ioExceptionError);
            System.exit(1);
        } 
        return inputRecord;  
    }    
    
    public static DataOutputStream openTheFileOutputStream(DataOutputStream 
            outputRecord)   
    {
        // Define the DataOutputStream 
        try
        {
            outputRecord = new DataOutputStream(new FileOutputStream("/Users"
                    + "/christinatrostle/Desktop/AnotherExample.txt"));
        }
        catch (SecurityException securityError)
        {
            System.out.println("Security Exception Error " + securityError);
            System.exit(1);
        }
        catch (IOException ioExceptionError)
        {
            System.out.println("IO Exception Error " + ioExceptionError);
            System.exit(1);
        } 
        return outputRecord;  
    }

    public static DataInputStream readTheFileInputStream(DataInputStream 
            inputRecord)
    {
        boolean endOfFile;
    
        endOfFile = false;
        
        while(!endOfFile) 
        {
            try
            {
                InventoryProduct inventoryProductRecord = new InventoryProduct();
           
                inventoryProductRecord.setInventoryProductNumber(inputRecord.
                        readInt());
                System.out.println("The Inventory Product Number is " + 
                        inventoryProductRecord.getInventoryProductNumber());
           
                inventoryProductRecord.setInventoryProductDescription(inputRecord.
                        readUTF());
                System.out.println("The Inventory Product Description is " + 
                        inventoryProductRecord.getInventoryProductDescription());
                                
                inventoryProductRecord.setInventoryProductPrice(inputRecord.
                        readDouble());
                System.out.println("The Inventory Product price is " + 
                        inventoryProductRecord.getInventoryProductPrice());
                                
                inventoryProductRecord.setInventoryQuantityOnHand(inputRecord.
                        readInt());
                System.out.println("The Inventory Quantity on hand is " + 
                        inventoryProductRecord.getInventoryQuantityOnHand());                
           
                inventoryProductRecord.setInventoryQuantityOnOrder(inputRecord.
                        readInt());
                System.out.println("The Inventory Quantity on order is " + 
                        inventoryProductRecord.getInventoryQuantityOnOrder());
           
                inventoryProductRecord.setInventoryQuantitySold(inputRecord.
                        readInt());
                System.out.println("The Inventory Quantity sold is "+ 
                        inventoryProductRecord.getInventoryQuantitySold());

            }
            
            catch (EOFException endOfFileException) 
            {
                System.out.println("End of Reading the File " + endOfFileException);
                System.exit(0);
            }
            catch (IOException ioExceptionError)
            {
                System.out.println("IO Exception Error " + ioExceptionError);
                System.exit(1);
            } 
        } 
        return inputRecord;  
    }  

    public static DataOutputStream writeRecordsOutputStream(DataOutputStream 
            outputRecord)
    {
        boolean processRecords;

        String inputData;        

        // Prompt the user if they would like to run the program
        inputData = JOptionPane.showInputDialog(null, "Would you like to add a "
                + "record \nType true for yes or false for no");
    
        processRecords  = Boolean.parseBoolean(inputData);
    
        InventoryProduct inventoryProductRecord = new InventoryProduct();
            
        // while loop to process multiple records
        while (processRecords)
        {                                             
            // Create a Scanner object for keyboard input
            Scanner keyboardInput = new Scanner(System.in);
                
            System.out.print("Enter the Inventory Product Number ");
            inventoryProductRecord.setInventoryProductNumber(keyboardInput.
                    nextInt());
            keyboardInput.nextLine();
                
            System.out.print("Enter the Inventory Product Description ");
            inventoryProductRecord.setInventoryProductDescription(keyboardInput.
                    nextLine());

            System.out.print("Enter the Inventory Product Price ");
            inventoryProductRecord.setInventoryProductPrice(keyboardInput.
                    nextDouble());

            System.out.print("Enter the Inventory Quantity on hand ");
            inventoryProductRecord.setInventoryQuantityOnHand(keyboardInput.
                    nextInt());
                
            keyboardInput.nextLine();   
                
            System.out.print("Enter the Inventory Quantity on order ");
            inventoryProductRecord.setInventoryQuantityOnOrder(keyboardInput.
                    nextInt());
                
            System.out.print("Enter the Inventory Quantity sold ");
            inventoryProductRecord.setInventoryQuantitySold(keyboardInput.
                    nextInt());
                
            try
            {    
                outputRecord.writeInt(inventoryProductRecord.
                        getInventoryProductNumber());
                
                outputRecord.writeUTF(inventoryProductRecord.
                        getInventoryProductDescription());

                outputRecord.writeDouble(inventoryProductRecord.
                        getInventoryProductPrice());

                outputRecord.writeInt(inventoryProductRecord.
                        getInventoryQuantityOnHand());
                
                outputRecord.writeInt(inventoryProductRecord.
                        getInventoryQuantityOnOrder());
                
                outputRecord.writeInt(inventoryProductRecord.
                        getInventoryQuantitySold());
            }
            
            catch (IOException ioExceptionError)
            {
                System.out.println("IO Exception Error " + ioExceptionError);
                System.exit(1);
            }    
   
        // Prompt the user if they want to add another record
        inputData = JOptionPane.showInputDialog(null, "Would you like to add "
                + "another record \nType true for yes or false for no");
       
        processRecords = Boolean.parseBoolean(inputData);
        }
        return outputRecord;
    }

    public static void closeTheFileInputStream(DataInputStream inputRecord)
    {
        try 
        {
            inputRecord.close();
        } 
        catch (IOException exceptionError) 
        {
            Logger.getLogger(ClassSequentialInventoryProduct.class.
                    getName()).log(Level.SEVERE, null, exceptionError);
        }
    }    

    public static void closeTheFileOutputStream(DataOutputStream outputRecord)
    {
        try 
        {
            outputRecord.close();
        } 
        catch (IOException exceptionError) 
        {
            Logger.getLogger(ClassSequentialInventoryProduct.class.
                    getName()).log(Level.SEVERE, null, exceptionError);
        }
    }    
}// End of the class

