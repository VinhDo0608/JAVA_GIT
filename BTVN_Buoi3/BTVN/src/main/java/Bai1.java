import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int[] nhap() {
		System.out.print("Nhap so phan tu cua mang:");
		int n = Integer.parseInt(sc.nextLine());
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static void xuat(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int TBC(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(i % 2 ==0 && a[i] % 2 != 0) {
				sum += a[i];
			}
		}
		return sum;
	}
	
	public static void min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] < min) {
				min = a[i];
		}
		System.out.print("Vi tri: ");
		for(int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void check(int[] a) {
		System.out.print("\nSo chinh phuong trong mang la: ");
		for(int i = 0; i < a.length; i++) {
			int m = (int)Math.sqrt(a[i]);
			if (m*m == a[i]) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static boolean checkPrime(int n) {

        if (n < 2) {
            return false;
        }

        int s = (int) Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		int n;
		int[] a = nhap();
		System.out.println("Trung binh cong = "+TBC(a));
		min(a);
		check(a);
		System.out.print("\nSo nguyen to trong mang: ");
		for(int i = 0; i < a.length; i++) {
			if(checkPrime(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		Arrays.sort(a);
		System.out.print("\nMang sau khi sap xep la: ");
		xuat(a);
	}
}
