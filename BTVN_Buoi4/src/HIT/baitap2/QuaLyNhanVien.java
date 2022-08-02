package HIT.baitap2;

import java.util.Scanner;

class NhanVien {
	private int maNV;
	private int tuoi;
	private String ten;
	private String diaChi;
	private String boPhan;
	
	static Scanner sc = new Scanner(System.in);
	static int id = 1001;
	public void nhap() {
		maNV = id++;
		System.out.println("Nhap vao tuoi: ");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ten nhan vien: ");
		ten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Nhap bo phan lam viec: ");
		boPhan = sc.nextLine();
	}
	
	public void xuat() {
		System.out.printf("%-5d %-15s %-5d %-10s %-7s%n",
				maNV, ten, tuoi, diaChi, boPhan);
	}
}

public class QuaLyNhanVien {
		public static void main(String[] args) {
			NhanVien[] nhanViens = new NhanVien[5];
			for(int i = 0 ; i < nhanViens.length; i++) {
				nhanViens[i] = new NhanVien();
				nhanViens[i].nhap();
			}
			System.out.printf("%-5s %-15s %-5s %-10s %-7s%n",
					"Ma NV", "Ten NV", "Tuoi", "Dia chi", "Bo Phan");
			for(NhanVien i : nhanViens)
				i.xuat();
		}
}	