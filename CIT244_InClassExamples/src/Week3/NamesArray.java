
package Week3;

public class NamesArray {
 
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNameArray[] = {"Tom","Cathy","Sam","John"};
        String lastNameArray[] = {"Smith","Swan","Simpson","Brown"};
        
        for (int i = 0; i < lastNameArray.length; i++) {
            System.out.println(firstNameArray[i]+" "+ lastNameArray[i]);
        }
    }
}
