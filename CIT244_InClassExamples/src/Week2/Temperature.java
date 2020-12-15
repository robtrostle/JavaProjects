
package Week2;


public class Temperature {
    private double ftemp;
    
    public Temperature(double t)
    {
        ftemp = t;
    }
    public void setFahrenheit(double t)
    {
        ftemp = t;
    }
    public double getFahrenheit()
    {
        return ftemp;
    }
    public double getCelsius()
    {
        double c = (5.0/9)*(ftemp - 32);
        return c;
    }
    public double getKelvin()
    {
        double k = getCelsius() + 273.0;
        return k;
    }
}
