import java.util.Scanner;

public class BMIcalculator
{
    public static void main( String [] args)
    {
        // Use a Scanner to input double values
        Scanner input = new Scanner ( System.in );
        System.out.println( "\n\n" );
        // Input user weight in pounds
        System.out.println( "Enter weight in pounds" );
        double weightPounds = input.nextInt();
        System.out.println( "You weigh " + weightPounds + " lbs." + "\n" );
        // Input user weight in inches
        System.out.println( "Enter height in inches" );
        double heightInches = input.nextInt();
        System.out.println( "You are " + heightInches + " inches tall." + "\n" );
        
        // Convert pounds to killograms
        double massKilograms = weightPounds * 0.45359237;
        // Convert inches to meters
        double heightMeters = heightInches * 0.0254;
        
        // BMI equation
        double BMI = (massKilograms) / Math.pow(heightMeters, 2);
        
        /* Round the BMI to tenths place value for simplicity */
        BMI = Math.round(BMI*10)/10.0d;
        
        // Output using System.out.println()
        System.out.println( "Your BMI is: " + BMI + "\n" );
        
        
        // Information to compare calcualted BMI to
        System.out.println( "BMI Values from the Department of Health & Human Services/National Institutes of Health" + "\n" + "underweight: less than 18.5" + "\n" + "Normal: 18.5 -  24.9" +"\n" + "Overweight: 25 - 29.9" + "\n" + "Obese: 30 or greater" );
    }
}
