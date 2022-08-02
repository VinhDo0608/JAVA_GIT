package HIT.baitap3;

import java.util.Scanner;

public class PhuongTrinhBac2 {
	private double a;
	private double b;
	private double c;
	
	static Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("Nhap he so a: ");
		this.a = sc.nextDouble();
		System.out.print("Nhap he so b: ");
		this.b = sc.nextDouble();
		System.out.print("Nhap he so c: ");
		this.c = sc.nextDouble();
	}
	
	public void tinhNO() {
		double x1 = 0;
		double x2 = 0;
		double delta = this.b*this.b - 4*this.a*this.c;
		if(delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if(delta == 0) {
			System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x1);
			x1 = x2 = -this.b/(2*this.a);
		} else {
			x1 = (-this.b - Math.sqrt(delta))/(2*this.a);
			x2 = (-this.b + Math.sqrt(delta))/(2*this.a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}
}
