/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.io.DataInputStream;
import java.io.IOException;

public class TestReadInventoryProductSequential {
    
    static DataInputStream inputRecord;
    
    public static void main(String[] args) throws IOException 
    {
        inputRecord = ClassSequentialInventoryProduct.
                openTheFileInputStream(inputRecord);
                
        ClassSequentialInventoryProduct.readTheFileInputStream(inputRecord);
        
        ClassSequentialInventoryProduct.closeTheFileInputStream(inputRecord);
    }
}

