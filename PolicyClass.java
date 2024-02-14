import java.util.Scanner;        // To get the user's input.
import java.util.ArrayList;

/**
   This program insures the policies for each member
   of the users' selection and provider holder.
*/

public class PolicyClass
{
  // Use the privates to get the variables.
   private String policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String smokingStatus;
   private double height;
   private double weight;

   public void setPolicy() 
   {
      this.policyNumber = "";
      this.providerName = "";
      this.policyholderFirstName = "";
      this.policyholderLastName = "";
      this.policyholderAge = 0;
      this.smokingStatus = "";
      this.height = 0.0;
      this.weight = 0.0;
   }

   public void Policy(String policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String smokingStatus,
                  double height, double weight) 
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyholderFirstName = policyholderFirstName;
      this.policyholderLastName = policyholderLastName;
      this.policyholderAge = policyholderAge;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

    // Setters and Getters
   public String getPolicyNumber() 
   {
      return policyNumber;
   }

   public void setPolicyNumber(String policyNumber) 
   {
      this.policyNumber = policyNumber;
   }

   public String getProviderName() 
   {
      return providerName;
   }

   public void setProviderName(String providerName) 
   {
      this.providerName = providerName;
   }

   public String getPolicyholderFirstName() 
   {
      return policyholderFirstName;
   }

   public void setPolicyholderFirstName(String policyholderFirstName) 
   {
      this.policyholderFirstName = policyholderFirstName;
   }

   public String getPolicyholderLastName() 
   {
      return policyholderLastName;
   }

   public void setPolicyholderLastName(String policyholderLastName) 
   {
      this.policyholderLastName = policyholderLastName;
   }

   public int getPolicyholderAge() 
   {
      return policyholderAge;
   }

   public void setPolicyholderAge(int policyholderAge) 
   {
      this.policyholderAge = policyholderAge;
   }

   public String getSmokingStatus() {
      return smokingStatus;
   }

   public void setSmokingStatus(String smokingStatus) 
   {
      this.smokingStatus = smokingStatus;
   }

   public double getHeight() 
   {
      return height;
   }

   public void setHeight(double height) 
   {
      this.height = height;
   }

   public double getWeight() 
   {
      return weight;
   }

   public void setWeight(double weight) 
   {
      this.weight = weight;
   }

   public double calculateBMI() 
   {
      return (weight * 703) / (height * height);
   }

   public double calculatePolicyPrice() 
   {
      double policyPrice = 600.0;
   
      if (policyholderAge > 50) {
         policyPrice += 75.0;
      }
   
      if (smokingStatus.equals("smoker")) 
      {
         policyPrice += 100.0;
      }
   
      double bmi = calculateBMI();
      if (bmi > 35) 
      {
         policyPrice += (bmi - 35) * 20;
      }
   
      return policyPrice;
      
      public String toString()
      {
         String str = "There were " + Policy +
                       " Objects created";
      }
   }           
   