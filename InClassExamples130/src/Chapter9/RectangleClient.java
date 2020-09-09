
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class RectangleClient {
    
    private double length = 1, width = 1, perimeter, area;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;//this is just referencing this rectagle. This 
        //instance of the object. 
    }
public double getWidth(){
       return width;
   }
public double setWidth(double width){
       this.width = width;
   }
   
   public double getPerimeter(){
       perimeter = 2 * width + 2 * length;
       return perimeter;
   }
   
   
   public double getArea(){
       area = width * length;
       return area;
   }
    @Override
   public String toString(){
       perimeter = getPerimeter();
       area = getArea();
    return "A rectangle with a length of " + length + " and a width of " + width
            + " has a perimeter of " + perimeter + " and an area of " + area + ".";
}
   
}
