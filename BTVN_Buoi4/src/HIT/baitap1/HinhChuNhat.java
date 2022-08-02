package HIT.baitap1;

import java.util.Scanner;

public class HinhChuNhat {
	
	private double chieuDai;
	private double chieuRong;
	
	static Scanner sc = new Scanner(System.in);
	
	public void input() {
		do {
			System.out.print("Nhap chieu dai hcn a: ");
			this.chieuDai = Double.parseDouble(sc.nextLine());
			System.out.print("Nhap chieu rong hcn a: ");
			this.chieuRong = Double.parseDouble(sc.nextLine());
		} while(this.chieuDai < this.chieuRong);
	}
	
	public double tinhCV() {
		return (this.chieuDai + this.chieuRong)*2;
	}
	
	public double tinhDT() {
		return this.chieuDai * this.chieuRong;
	}
	
	public void display() {
		System.out.printf("%9.2f %11.2f %9.2f %10.2f%n", chieuDai, chieuRong, tinhCV(), tinhDT());
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	
	
}
