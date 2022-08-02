package HIT.baitap1;

import java.util.Scanner;

public class samira {
	
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		HinhChuNhat a = new HinhChuNhat();
		HinhChuNhat b = new HinhChuNhat();
		a.input();
		do {
			System.out.print("Nhap chieu dai hcn b: ");
			b.setChieuDai(sc.nextDouble());
			System.out.print("Nhap chieu rong hcn b: ");
			b.setChieuRong(sc.nextDouble());
		} while(b.getChieuDai() < b.getChieuRong());
		b.tinhCV();
		b.tinhDT();
		System.out.println("\t---------TONG TIN HINH CHU NHAT VUA NHAP---------");
		System.out.printf("%9s %11s %9s %10s%n", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
		a.display();
		b.display();
	}

}
