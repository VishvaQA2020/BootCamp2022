
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        //check the area of circle

        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Radius of Circle:");
        double  r= Sc.nextDouble();
        double area= (Math.PI*r*r);
        System.out.println("The Area Of Cicle is " + area);




    }
}
