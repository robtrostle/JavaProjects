


import java.text.DecimalFormat; // YOU MAY NEED THIS IN TOSTRING METHOD

/**
 * Complete the code below the numbered comments, 1 - 4.
 * Do not change the pre-written code
 * Exam 2
 * @author Robert Trostle
 */
public class HouseListing
{
    /*
     * 1. Create instance variables as shown in UML
     */
    private String listingNumber;
    private String houseDescription;
    private double listingPrice;
    
    DecimalFormat dmt = new DecimalFormat("$###,###,###.00");
    
    /* 
     * default constructor (If an empty house object is created)
     * assigns listingNumber the text string 0000
     * assigns houseDescription an empty text string
     * assigns listingPrice the value of 1.0
     */
    public HouseListing( )
    {
        listingNumber = "0000";
        houseDescription = "";
        listingPrice = 1.0;
    }
    /* 
     * 2.
     * Overloaded Constructor
     * call the method setListingNumber() passing listCode
     * assigns houseDescription the value style holds
     * call the method setPrice() passing price
     */
    public HouseListing(String listCode, String style, double price)
    {
        setListingNumber(listCode);
        houseDescription = style;
        setPrice(price);
    }
    /*
     * accessor method
     * returns listingNumber
     */
    public String getHouseListing( )
    {
        return listingNumber;
    }
    /*
     * accessor method
     * returns houseDescription
     */
    public String getHouseDescription( )
    {
        return houseDescription;
    }
    /*
     * accessor method
     * returns listingPrice
     */
    public double getListPrice( )
    {
        return listingPrice;
    }
    /* 3.
     * mutator method
     * parameter changedNumber
     * method checks the number of characters in the parameter
     * if the number of characters is less than 4 assign 
     * listingNumber a string of 4 zeros, otherwise assign 
     * listingNumber the value of the parameteer
     */
    private void setListingNumber(String changedNumber)
    {
        if (changedNumber.length() < 4){
            listingNumber = "0000";
        }else listingNumber = changedNumber;
        
    }
    /*
     * mutator method
     * parameter changeStyle
     * assigns houseDescription the parameter value
     */
    public void setHouseDescription(String changeStyle)
    {
       houseDescription = changeStyle;  
    }
    
    /* 4.
     * mutator method
     * parameter changePrice
     * method checks the parameter's value if the value is zero 
     * or less assign listingPrice one dollar, otherwise 
     * assign listingPrice the parameter value
     */
    public void setPrice(double changedPrice)
    {
        if (changedPrice <= 0){
            listingPrice = 1;
        }else listingPrice = changedPrice;
               
    }
    /* 5.
     * this method displays a formatted text string with the values the
     * instance variables hold. See example of output for formatting'
     * think, decimal formatting, or printf
     */
    @Override
    public String toString()
    {
        return "Listing Number: " + listingNumber + ", " + " Description: " +
                houseDescription + ", " + " Listing Price: " + dmt.format(listingPrice); // written for syntax only, an error otherwise                
    }

    
}
