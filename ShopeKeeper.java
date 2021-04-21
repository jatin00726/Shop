package Experiment;
import java.util.*;
import java.util.Iterator;



public class Shopkeeper {
	public static void main(String[] args) {

	System.out.println("*****MAIN MENU*****");
	System.out.println("1.SHOPKEEPER");
	System.out.println("2.AS CUST0MER");
	System.out.println("3.EXIT");
	System.out.println("ENTER CHOICE 1-3");

	Scanner Choice=new Scanner(System.in);
	int a=Choice.nextInt();
	if(a==1)
	{
		System.out.println("Welcome to Shop:");
		System.out.println("1.Add Stock");
		System.out.println("2.Display All");
		System.out.println("exit");
		System.out.println("Enter Choice 1-3");
		int b=Choice.nextInt();
		switch(b) {
		case 1:
			HashMap<Integer, String> item= new HashMap<>();
			HashMap<Integer, String> cost= new HashMap<>();
			boolean flag = false;
			
		while (flag==true) {
				
				System.out.print("Enter ID number:");
				Integer idNumber = Integer.parseInt(Choice.nextLine());

				
				System.out.print("Enter Name:");
				String name =Choice.nextLine();
				
				System.out.print("Enter Cost:");
				Integer Cost = Integer.parseInt(Choice.nextLine());
				

				String oldVal = item.put(idNumber, name);
				String oldVal1 = cost.put(Cost, name);

				

				// ask user to check if another entry is required
				System.out.print("Enter another Item (y/n)?");
				String answer = Choice.nextLine();

				// condition to satisfy in order to loop again
				if (answer.equals("y") || answer.equals("Y")) {
					continue;
				} else {
					flag=false;
				}
		}
		break;
		case2:
			 Iterator<Integer> itr = item.keySet().iterator();
		 while (itr.hasNext()) {
			 
		 }
		 
		 }
	}
}
	
}
