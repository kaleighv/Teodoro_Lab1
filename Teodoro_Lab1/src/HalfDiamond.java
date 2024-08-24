//import scanner class
import java.util.Scanner;
//create class name
public class HalfDiamond{
    public static void main(String[] args){ //main method
        Scanner input = new Scanner(System.in); //create  an object of scanner
        System.out.print("Enter number: ");
        int number = input.nextInt(); //user input
        
            System.out.println("*");
            for (int i = 1; i <= number; i++ ){
                for (int a = i; a <= i; a++){
                    System.out.print("*");
                }
                for (int c = 1; c <= i; c++){
                    System.out.print(c);
                }
                for (int c = i - 1; c > 0; c--){
                    System.out.print(c);
                }
                System.out.println("*");//output of upper part of the half diamond
            }


            for (int m = number - 1; m > 0; m--){
                for (int a = m; a <= m; a++){
                    System.out.print("*");
                }
                for (int n = 1; n <= m; n++){
                    System.out.print(n);
                }
                for (int n = m - 1; n > 0; n--){
                    System.out.print(n);
                }
                System.out.println("*");
            }
            System.out.println("*");//output of lower part of the half diamond
        }
        
}