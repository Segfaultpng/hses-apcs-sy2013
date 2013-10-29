/**
 * Created with IntelliJ IDEA.
 * User: Guest
 * Date: 10/18/13
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class IceCreamCone {
    private double height;
    private double radius;
    public static void main (String args[]){

        IceCreamCone ic = new IceCreamCone(5,10);
        System.out.println(" here's the SA");
        System.out.println(ic.getSurfaceArea());
        System.out.println(" here's the volume");
        System.out.println(ic.getVolume());

    }

    public IceCreamCone(double newHeight, double newRadius){
       height = newHeight;
       radius = newRadius;


    }
    public double getSurfaceArea(){
      double slantLength = Math.sqrt((height*height) + (radius*radius));

      return ((Math.PI*radius)*slantLength)+(Math.PI*(radius*radius));
    }
    public double getVolume(){



       return (((double)1/3)*(Math.PI*Math.pow(radius,2))*height);
    }
}
