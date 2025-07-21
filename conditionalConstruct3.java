import java.util.Scanner;
public class conditionalConstruct3{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter your monthly sales: ");
	int sales = input.nextInt();
	
	if (sales>2000){
	double commission = 0.1 * sales + 50;
	System.out.println("your monthly sales commission is: " + " " +commission);
	
	}
	else{
	double commission = 0.1 * sales;
	System.out.println("your monthly sales commission is: " + " " + commission);
	
	}
	}

}