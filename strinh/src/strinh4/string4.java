package strinh4;
import java.util.Scanner;
public class string4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi1;
		String chuoi2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao chuoi 1: ");
		chuoi1 = scanner.nextLine();
		System.out.println("Nhap vao chuoi 2: ");
		chuoi2 = scanner.nextLine();
		String chuoi3 = chuoi1.concat(chuoi2);
		System.out.println("chuoi sau khi gop chuoi 1 va chuoi 2 la: " + chuoi3);
	}
}

