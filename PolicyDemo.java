import java.util.Scanner;        // To get the user's input.
import java.util.ArrayList;

/**
   This program insures the policies for each member
   of the users' selection and provider holder.
*/

public class PolicyDemo
{
   public static void main(String[] args)
   {
      // Declare all the variables.
      int policyNumber, age;
      double height, weight;
      String providerName, firstName, lastName, smoking;
      
      // Create a Scanner keyboard object to get the user's input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an Array List for the policy.
      ArrayList<Policy> = new Policy<>();
      
      // Ask the user to enter their policy number.
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine();
      
      // Ask the user to enter their provider name.
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.next();
      
      // Ask the user to enter their policy holder's first name.
      System.out.print("Please enter the Policy holder's first name: ");
      firstName = keyboard.next();
      
      // Ask the user to enter their policy holder's last name.
      System.out.print("Please enter the Policy holder's last name: ");
      lastName = keyboard.next();
      
      // Ask the user to enter the policy holder's age.
      System.out.print("Please enter the Policy holder's age: ");
      age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      // Ask the user to enter the policy holder's smoking status.
      System.out.print("Please enter the Policy Holder's Smoking Status: ");
      smoking = keyboard.next();
      
      // Ask the user to enter the policy holder's height in inches.
      System.out.print("Please enter the Policy Holder's Height (in in.): ");
      height = keyboard.nextDouble();
      
      // Ask the user to enter the policy holder's weight in pounds.
      System.out.print("Please enter the Policy Holder's Weight (in lbs.): ");
      weight = keyboard.nextDouble();
      
      // Create the policy input 
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);
         
      // Display the policy holder's number, provider name, first name, 
      // last name, age, smoking status,  
      // height, weight, BMI, and policy price.
      System.out.println("\n\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policy holder's first name: " + policy.getPhFirstName());
      System.out.println("Policy holder's last name: " + policy.getPhLastName());
      System.out.println("Policy holder's Age: " + policy.getPhAge());
      System.out.println("Policy holder's smoking status: " + policy.getPhSmokeStatus());
      System.out.println("Policy holder's height: " + policy.getInches() + " inches");
      System.out.println("Policy holder's weight: " + policy.getWeight() + " pounds.");
      System.out.println("Policy holder's BMI: " + policy.calculateBMI());
      System.out.println("Policy Price: $" + policy.calculatePolicyPrice());
      
      System.out.println("There were " + Policy + " Objects created.");
   }
}