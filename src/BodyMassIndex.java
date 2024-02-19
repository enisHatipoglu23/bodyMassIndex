import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class BodyMassIndex {
    double weight, height, bodyIndex;
    Scanner scan = new Scanner(System.in);
     void bmiCalc(){
        System.out.println("Enter your height: ");
        height = scan.nextDouble();
         System.out.println(height);

        System.out.println("Enter your weight: ");
        weight = scan.nextDouble();

        bodyIndex = (weight / (height*height));

        System.out.println("Your body index is " + bodyIndex + ".");


    }





}
