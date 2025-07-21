import java.util.Scanner;
public class conditionalConstruct4{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter your annual Salary: ");
	int Salary = input.nextInt();
	
	if (Salary>35000){
	double Tax = (Salary * 0.05) + 0.1 *(Salary-35000);
	System.out.println("your Salary is: " + " " + Salary);
	System.out.println("your annual Tax is: " + " " + Tax);
	System.out.println("--------------------------------- ");
	System.out.println("your Net payable Salary is: " + " " + (Salary- Tax));
	
	}
	else{
	double Tax  = Salary * 0.05;
	System.out.println("your annual Salary is: " + " " + Tax);
	System.out.println("your annual Tax is: " + " " + Tax);
	System.out.println("--------------------------------- ");
	System.out.println("your Net payable Salary is: " + " " + (Salary- Tax));
	
	}
	/*/double Tax = (Salary>35000) ? Salary * 0.5 + 0.1 * (Salary-35000): Salary * 0.05;
	System.out.println("your Salary is: " + " " + Salary);
	System.out.println("your annual Tax is: " + " " + Tax);
	System.out.println("--------------------------------- ");
	System.out.println("your Net payable Salary is: " + " " + (Salary- Tax));
	
	}

}