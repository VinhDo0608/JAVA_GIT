import java.util.Scanner;

public class Bai_1 {

static Scanner sc = new Scanner(System.in);
	
	public static int nhapNgay(int ngayCuoi) {
		int ngay;
		do {
			System.out.print("Nhap ngay: ");
			ngay = Integer.parseInt(sc.nextLine());
		}while(ngay < 1 || ngay > ngayCuoi);
		return ngay;
	}
	
	public static void checkCHD(int ngay, int thang) {
		if(ngay>=20 && thang==1 || ngay<=18 && thang==2) {
			System.out.println("Ban thuoc cung Bao Binh!");
		}else if(ngay>=19 && thang==2 || ngay<=20 && thang==3) {
			System.out.println("Ban thuoc cung Song Ngu!");
		}else if(ngay>=21 && thang==3 || ngay<=20 && thang==4) {
			System.out.println("Ban thuoc cung Bach Duong!");
		}else if(ngay>=21 && thang==4 || ngay<=20 && thang==5) {
			System.out.println("Ban thuoc cung Kim Nguu!");
		}else if(ngay>=21 && thang==5 || ngay<=21 && thang==6) {
			System.out.println("Ban thuoc cung Song Tu!");
		}else if(ngay>=22 && thang==6 || ngay<=22 && thang==7) {
			System.out.println("Ban thuoc cung Cu Giai!");
		}else if(ngay>=23 && thang==7 || ngay<=22 && thang==8) {
			System.out.println("Ban thuoc cung Su Tu!");
		}else if(ngay>=23 && thang==8 || ngay<=22 && thang==9) {
			System.out.println("Ban thuoc cung Xu Nu!");
		}else if(ngay>=23 && thang==9 || ngay<=23 && thang==10) {
			System.out.println("Ban thuoc cung Thien Binh!");
		}else if(ngay>=24 && thang==10 || ngay<=22 && thang==11) {
			System.out.println("Ban thuoc cung Bo Cap!");
		}else if(ngay>=23 && thang==11 || ngay<=21 && thang==12) {
			System.out.println("Ban thuoc cung Nhan Ma!");
		}else if(ngay>=22 && thang==12 || ngay<=19 && thang==1) {
			System.out.println("Ban thuoc cung Ma Ket!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ngay = 0, thang, nam;
		
		do {
			System.out.print("Nhap thang: ");
			thang = Integer.parseInt(sc.nextLine());
		}while(thang < 1 || thang > 12);
		System.out.println("Nhap nam: ");
			nam = Integer.parseInt(sc.nextLine());

		
		switch (thang) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			ngay = nhapNgay(31);
			break;
		case 4: case 6: case 9: case 11:
			ngay = nhapNgay(30);
			break;
		case 2:
			if(nam % 400 == 0 || nam % 4 ==0 && nam % 100 != 0) 
				ngay = nhapNgay(29);
			else
				ngay = nhapNgay(28);
			break;
		default: 
			System.exit(0);
			break;
		}
		checkCHD(ngay, thang);
		
	}

}
