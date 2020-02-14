import java.util.Scanner;

public class BMICalculator {
	//variable declaration
		private double BMI_calc, height, weight;
		private int user_choice;
		Scanner user_BMI = new Scanner(System.in);
		String BMI_category = "";
		
		//Function call to readUnitType so I can readUserData
		public void readUserData() {
			readUnitType();
		}
		
		private void readUnitType() {
			//prompt the user to begin with the program
			System.out.println("Please enter 1 or 2 to begin.\n");
			System.out.println("1- Please enter your height in inches, and your weight in pounds: \n");
			System.out.println("2- Please enter your height in meters, and your weight in kilograms: \n");
			
			//store the choice in a variable and proceed to prompt the user for BMI measurements
			user_choice = user_BMI.nextInt();
			readMeasurementData(user_choice);
		}
		
		//Will provide a series of function calls depending on user choice, to read either the metric or imperial data
		private void readMeasurementData(int user_choice) {
			if(user_choice == 1)
				readMetricData();
			
			else if(user_choice == 2)
				readImperialData();
		}
		
		public void readMetricData() {
			//Prompt the user to enter their height and function call to set the height for BMI calculation
			System.out.println("Please enter you height in inches: \n");
			height = user_BMI.nextDouble();
			setHeight();
			
			//Prompt the user to enter their weight and function call to set the weight for BMI calculation
			System.out.println("Please enter your weight in pounds: \n");
			weight = user_BMI.nextDouble();
			setWeight();
		}
			
		
		public void readImperialData() {
			//Prompt the user to enter their height and function call to set the height for BMI calculation
			System.out.println("Please enter you height in inches: \n");
			height = user_BMI.nextDouble();
			setHeight();
			
			//Prompt the user to enter their weight and function call to set the weight for BMI calculation
			System.out.println("Please enter your weight in pounds: \n");
			weight = user_BMI.nextDouble();
			setWeight();
		}
		
		//will calculate BMI depending on user_choice and then set to categorize the BMI results with a function call to calculateBMICategory
		public void calculateBMI() {
			if(user_choice == 1) {
				BMI_calc = (weight * 703) / (height * height);
				calculateBMICategory();
			}
			
			else if(user_choice == 2) {
				BMI_calc = weight / (height * height);
				calculateBMICategory();
			}
		}
		
		//Will categorize the BMI according to the BMI indexes
		public void calculateBMICategory() {
			if(BMI_calc < 18.5)
				BMI_category = "Underweight";
			
			else if(BMI_calc >= 18.5 && BMI_calc <= 24.9)
				BMI_category = "Noraml";
			
			else if(BMI_calc >= 25.0 && BMI_calc <= 29.9)
				BMI_category = "Overweight";
			
			else if(BMI_calc >= 30.0)
				BMI_category = "Obese";
			
			else
				readMeasurementData(user_choice);
			
		}
		
		//Display the BMI calculations and categorization
		public void displayBMI() {
			System.out.println("Your BMI is currently: " + getBMI());
			System.out.println("This BMI places you under the BMI category of: " + getBMICategory());
		}
		
		//return height
		public double getHeight() {
			return height;
		}
		
		//provide a case for dealing with negative height and then a function call to get the height
		private void setHeight( ) {
			if(height < 0)
				readMeasurementData(user_choice);
			
			getHeight();
		}
		
		//return weight
		public double getWeight() {
			return weight;
		}
		
		//provide a case for dealing with negative weight and a function call to get the weight
		private void setWeight() {
			if(weight < 0)
				readMeasurementData(user_choice);
			
			getWeight();
		}
		
		//return the BMI calculation
		public double getBMI() {
			return BMI_calc;
		}
		
		//return the categorization of the user's BMI
		public String getBMICategory() {
			return BMI_category;
		}
		
		public static void main(String[] args) {
			//calculate the BMI through specific function calls to determine the user's BMI
			BMICalculator test_calc = new BMICalculator();
			test_calc.readUserData();
			test_calc.calculateBMI();
			test_calc.displayBMI();
		}
}
