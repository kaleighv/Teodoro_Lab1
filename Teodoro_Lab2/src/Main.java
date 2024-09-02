//import scanner class; for user input.
import java.util.Scanner;
//create class cylinder.
class Cylinder {
    double radius;
    double height;
    double area;
    //create a method that calculate the area of the cylinder.
    public void Area(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * height;
        System.out.println("Area: " + area);
    }
}
//create a class that inherits from the class called Cylinder.
class CylinderVol extends Cylinder{
    double volume;
    // create a method that calculates the volume of the cylinder.
    public void Volume(){
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume: " + volume);
    }
}

public class Main{
    public static void main(String[] args) {
        //create an object for calling the methods.
        CylinderVol cylinder = new CylinderVol();
        cylinder.Area();
        cylinder.Volume();
    }
}
