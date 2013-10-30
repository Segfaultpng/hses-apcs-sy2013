/**
 * Created with IntelliJ IDEA.
 * User: Guest
 * Date: 10/18/13
 * Time: 8:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Square {
    private double sideLength;

    public static void main (String [] args){

         Square s = new Square(5);

        System.out.print(s.getArea());
        System.out.print(" Space here ");
        System.out.print((int)s.getDiagonal());





    }

    public Square(double newsideLength){
       sideLength = newsideLength;


    }

    public double getArea(){

       return sideLength*sideLength;
    }
    public double getDiagonal(){



        return sideLength*(Math.sqrt(2));
    }

}

