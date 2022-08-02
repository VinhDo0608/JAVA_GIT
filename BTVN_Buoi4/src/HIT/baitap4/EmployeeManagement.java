package HIT.baitap4;

import java.util.Scanner;

public class EmployeeManagement {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.input();
		employee.output();
	}
}