
package Week2;

import java.util.Scanner;


public class TempDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double f;
        System.out.print("Enter a temperature in fahrenheit: ");
        f = scan.nextDouble();
        
        Temperature temp = new Temperature(f);
        System.out.println("F = " + temp.getFahrenheit());
        System.out.println("C = " + temp.getCelsius());
        System.out.println("K = " + temp.getKelvin());
        
        
        
    }
    
}
