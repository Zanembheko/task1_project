package task1_project;
import java.util.Scanner;

public class HelloWorld 
{
	
		public static void main(String [] args)
		{
			System.out.println("Good day please enter your name:");
			Scanner name = new Scanner(System.in);
			String new_name = name.nextLine();
			
			System.out.println("Hello "+new_name+" Git is awesome!");
			
		}
	

}
