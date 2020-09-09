
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class Temperature {
    
    private double ftemp;
    
    public Temperature(double t){//contstructor. Must get double
        
        ftemp = t;
        
    }
    
    public void setFahrenheit(double t){//why even use a setter? So we can update the variable if we need to. 
        
        ftemp = t;      
    }
    public double getFahrenheit(){
        
        return ftemp;
    }
    public double getCelsius(){
        double c = (5.0 / 9) * (ftemp -32);
        return c;
        //can also just returen the calc
    }
    public double getKelvin(){
        double k = ((5.0 / 9) * (ftemp -32)) + 273;
        return k;
        //Can also say getCelsius() + 273;
    }
    
    
}
