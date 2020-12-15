
package Week2;

/**
 *
 * @author robtr
 */
public class InventoryProduct {
    // Data members for the Inventory Product Class
    private int inventoryProductNumber;
    private String inventoryProductDescription;
    private double inventoryProductPrice;
    private int inventoryQuantityOnHand;
    private int inventoryQuantityOnOrder;
    private int inventoryQuantitySold;

    // Default constructor
    public InventoryProduct()
    {
        inventoryProductNumber = 1;
        inventoryProductDescription = "Test";
        inventoryProductPrice = 1000.00;
        inventoryQuantityOnHand = 10;
        inventoryQuantityOnOrder = 10;
        inventoryQuantitySold = 10;
    }
    
    // Overloaded constructors (all variables) - defines what type of object it 
    // creates
    public InventoryProduct(
            int inventoryProductNumber,
            String inventoryProductDescription,
            double inventoryProductPrice,
            int inventoryQuantityOnHand,
            int inventoryQuantityOnOrder,
            int inventoryQuantitySold)
    {
        this.inventoryProductNumber = inventoryProductNumber;
        this.inventoryProductDescription = inventoryProductDescription;
        this.inventoryProductPrice = inventoryProductPrice;
        this.inventoryQuantityOnHand = inventoryQuantityOnHand;
        this.inventoryQuantityOnOrder = inventoryQuantityOnOrder;
        this.inventoryQuantitySold = inventoryQuantitySold;
    }

    // Mutator method to set the inventory product number
    public void setInventoryProductNumber(int inventoryProductNumber) {
        this.inventoryProductNumber = inventoryProductNumber;
    }
    
    // Method overloading
    public void setInventoryProductNumber(String inventoryProductNumber) {
        setInventoryProductNumber(Integer.parseInt(inventoryProductNumber));
    }
    
    // Accessor method to get the inventory product number
    public int getInventoryProductNumber() {
        return inventoryProductNumber;
    }

    // Mutator method to set the inventory product description
    public void setInventoryProductDescription(String inventoryProductDescription) {
        this.inventoryProductDescription = inventoryProductDescription;
    }
    
    // Accessor method to get the inventory product description
    public String getInventoryProductDescription() {
        return inventoryProductDescription;
    }

    // Mutator method to set the inventory product price
    public void setInventoryProductPrice(double inventoryProductPrice) {
        this.inventoryProductPrice = inventoryProductPrice;
    }
    
    // Method overloading
    public void setInventoryProductPrice(String inventoryProductPrice) {
        setInventoryProductPrice(Double.parseDouble(inventoryProductPrice.
                replaceAll("\\$", "")));
    }
    
    // Accessor method to get the inventory product price
    public double getInventoryProductPrice() {
        return inventoryProductPrice;
    }
    
    public String getInventoryProductPriceFormatted()
    {
        return String.format("$%.2f", getInventoryProductPrice());
    }

    // Mutator method to set the inventory quantity on hand
    public void setInventoryQuantityOnHand(int inventoryQuantityOnHand) {
        this.inventoryQuantityOnHand = inventoryQuantityOnHand;
    }
    
    // Method overloading
    public void setInventoryQuantityOnHand(String setInventoryQuantityOnHand) {
        setInventoryQuantityOnHand(Integer.parseInt(setInventoryQuantityOnHand));
    }
    
    // Accessor method to get the inventory quantity on hand
    public int getInventoryQuantityOnHand() {
        return inventoryQuantityOnHand;
    }

    // Mutator method to set the inventory quantity on order
    public void setInventoryQuantityOnOrder(int inventoryQuantityOnOrder) {
        this.inventoryQuantityOnOrder = inventoryQuantityOnOrder;
    }
    
    // Method overloading
    public void setInventoryQuantityOnOrder(String setInventoryQuantityOnOrder) {
        setInventoryQuantityOnOrder(Integer.parseInt(setInventoryQuantityOnOrder));
    }
    
    // Accessor method to get the inventory quantity on order
    public int getInventoryQuantityOnOrder() {
        return inventoryQuantityOnOrder;
    }

    // Mutator method to set the inventory quantity sold
    public void setInventoryQuantitySold(int inventoryQuantitySold) {
        this.inventoryQuantitySold = inventoryQuantitySold;
    }
    
    // Method overloading
    public void setInventoryQuantitySold(String setInventoryQuantitySold) {
        setInventoryQuantitySold(Integer.parseInt(setInventoryQuantitySold));
    }
    
    // Accessor method to get the inventory quantity sold
    public int getInventoryQuantitySold() {
        return inventoryQuantitySold;
    }
    
    // Method to calculate the current product inventory
    public int getCurrentProductInventory()
    {
        int currentProductInventory = inventoryQuantityOnHand +
                inventoryQuantityOnOrder - inventoryQuantitySold;
        return currentProductInventory;
    }  
    
    // Method to calculate the dollar value of the inventory product
    public double getDollarValueInventory()
    {
        double dollarValueInventory = inventoryProductPrice * 
                (inventoryQuantityOnHand + inventoryQuantityOnOrder -
                inventoryQuantitySold);
        return dollarValueInventory;
    }
    
    public String getDollarValueInventoryFormatted()
    {
        return String.format("$%.2f", getDollarValueInventory());
    }
    
    // Method to show the inventory product class object
    @Override
    public String toString() 
    {
        StringBuilder str = new StringBuilder();
        
        str.append("The Inventory Product Number is ");
        str.append(getInventoryProductNumber());
        str.append("\n");
        
        str.append("The Inventory Product Description is ");
        str.append(getInventoryProductDescription());
        str.append("\n");
        
        str.append("The Inventory Product Price is ");
        str.append(String.format("$%.2f", getInventoryProductPrice()));
        str.append("\n");
        
        str.append("The Inventory Product Quantity on hand is ");
        str.append(getInventoryQuantityOnHand());
        str.append("\n");
        
        str.append("The Inventory Product Quantity on order is ");
        str.append(getInventoryQuantityOnOrder());
        str.append("\n");
        
        str.append("The Inventory Product Quantity sold is ");
        str.append(getInventoryQuantitySold());
        str.append("\n");
        
        str.append("The Current Product Inventory is ");
        str.append(getCurrentProductInventory());
        str.append("\n");
        
        str.append("The Dollar Value of the Inventory Product is ");
        str.append(String.format("$%.2f", getDollarValueInventory()));
        str.append("\n");
        
        return str.toString();
    }
} // End of the class
    

