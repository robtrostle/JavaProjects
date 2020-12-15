/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.io.DataOutputStream;

public class TestWriteInventoryProductSequential {  
    static DataOutputStream outputRecord;
    
    public static void main(String[] args) {
        outputRecord = ClassSequentialInventoryProduct.
                openTheFileOutputStream(outputRecord);
                
        ClassSequentialInventoryProduct.writeRecordsOutputStream(outputRecord);
        
        ClassSequentialInventoryProduct.closeTheFileOutputStream(outputRecord);
    }
}

