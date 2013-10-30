/**
 * Created with IntelliJ IDEA.
 * User: 14pettuss
 * Date: 10/17/13
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Converter {
    double conversionFactor;

    public static void main (String[]args){

     final double MILE_TO_KM = 1.609;
     final double METERS_TO_FEET = 0.3048;
     final double METERS_TO_Inches = 0.0254;
   Converter c = new Converter(1000*1.609);

    }


    public Converter(double aConversionFactor){
        conversionFactor = aConversionFactor;



    }
    public double convertTo(double fromMeasurement){

           return conversionFactor * fromMeasurement;

    }
    public double convertFrom(double toMeasurement){



        return  toMeasurement / conversionFactor;
    }

}
