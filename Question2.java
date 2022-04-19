import java.util.Scanner;
import java.lang.Math;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    double height, weight, bmi;
    Scanner objOne = new Scanner (System.in);
    weight = objOne.nextDouble();
    Scanner objTwo = new Scanner(System.in);
    height = objTwo.nextDouble();
    
    bmi = weight / Math.pow(height/100,2);
    System.out.println(bmi);

  }
}
