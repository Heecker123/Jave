package hamthaythemotchuoicontrongchuoikytubangchuoikhac;
import java.util.Scanner;
public class HamThayMotChuoiConTrogChuoiKyTuBangChuoiKhac {
	/*
	 * Cú pháp: string1.replace(char oldChar, char newChar);
	 * Chức năng: Hàm sẽ thay thế ký tự oldChar bằng ký tự newChar trong chuỗi string1. 
	 * Nếu ký tự cần thay thế không có trong chuỗi string1 thì chương trình sẽ trả về chuỗi string1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi1;
		String chuoi2;
		String chuoi3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi 1: ");
		chuoi1 = scanner.nextLine();
		System.out.println("Nhap chuoi 2: ");
		chuoi2 = scanner.nextLine();
		System.out.println("Nhap chuoi 3: ");
		chuoi3 = scanner.nextLine();
		System.out.println("Chuoi " + chuoi1 + " sau khi bi thay the " + chuoi2 + " boi chuoi " + chuoi3 + " la: " + chuoi1.replace(chuoi2, chuoi3));
	}

}
