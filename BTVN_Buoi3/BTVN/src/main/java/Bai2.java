import java.util.Scanner;
import java.lang.String;

public class Bai2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String chuanHoa(String a) {
	    a = a.trim().toLowerCase();
	    a = a.replaceAll("\\s+", " ");
	    a = a.replaceAll("\\d+", "");
	    String[] temp= a.split(" ");
	    a="";
	    for(int i=0;i<temp.length;i++) {
	        a += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
	        if(i<temp.length-1)
	            a += " ";
	    }
	    return a;
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap chuoi: ");
		String a = sc.nextLine();
		System.out.print("Chuoi sau khi chuan hoa la: "+chuanHoa(a));
	}
}
