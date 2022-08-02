package HIT.baitap4;

import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private int age;
	private double workingDays;
	
	static Scanner sc = new Scanner(System.in);
	final int PRICE = 50;
	
	public double salary() {
		return workingDays * PRICE;
	}
	
	public void input() {
		System.out.println("Nhap id: ");
		id = sc.nextLine();
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so ngay lam viec: ");
		workingDays = Double.parseDouble(sc.nextLine());
	}
	
	public void output() {
		System.out.println("\nID: " + id);
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("So ngay lam viec: " + workingDays);
		System.out.printf("Luong: %,.2f", salary());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(double workingDays) {
		this.workingDays = workingDays;
	}

	public Employee(String id, String name, int age, double workingDays) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDays = workingDays;
	}

	public Employee() {
		super();
	}
	
	
}