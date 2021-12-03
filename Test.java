import java.util.Scanner;

public class Test {
		//ctrl+shift+o
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int empId	=scan.nextInt();
		System.out.println("Enter Employee Name:");
		String empName	=scan.next();
		System.out.println("Enter Employee salary:");
		float salary	=scan.nextFloat();
		System.out.println("Enter Employee contact:");
		long contact	=scan.nextLong();
		
		System.out.println(empId+"  "+empName+"  "+salary+" "+contact);
		
		scan.close();
	}

}
