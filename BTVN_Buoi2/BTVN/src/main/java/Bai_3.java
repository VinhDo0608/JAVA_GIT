import java.util.Scanner;

public class Bai_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.print("Tong cac uoc cua n: "+sum);
	}

}
