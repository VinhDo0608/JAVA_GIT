import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Nhap canh a: ");
		a = sc.nextInt();
		System.out.print("Nhap canh b: ");
		b = sc.nextInt();
		System.out.print("Nhap canh c: ");
		c = sc.nextInt();
		
		if(a + b > c && a + c > b && b + c> a) {
			if(a == b && a == c) {
				System.out.println("Tam giac deu!");
			} else if (a == b || b == c || a == c) {
				if (a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) {
					System.out.println("Tam giac vuong can!");
				} 
				else {
					System.out.println("Tam giac can!");
				} 
			} 
			else if (a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) {
				System.out.println("Tam giac vuong!");
			} else {
				System.out.println("Tam giac thuong!");
			}
		} 
		else {
			System.out.println("Khong tao thanh tam giac!");
		}
	}

}
