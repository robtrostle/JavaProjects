
package Chapter9;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class TemperatureDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        double temp;
        
        System.out.print("Enter the Fahrenheit temperature --> ");
        temp = scan.nextDouble();
        
        Temperature t = new Temperature(temp);//dont have a default constructor. Must pass a double! 
        System.out.println("Here are the temperature: ");
        System.out.println("F = " + t.getFahrenheit());
        System.out.println("C = " + t.getCelsius());
        System.out.println("K = " + t.getKelvin());
        
        t.setFahrenheit(90);
        System.out.println(t.getFahrenheit());
    }
    
}
