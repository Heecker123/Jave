package strinh2;
import java.util.Scanner;
public class Strinhvd3 {
	// Hàm xác định độ dài chuỗi ký tự 
	/*
	 * int length = tên_chuỗi.length();
	 */
	public static void main(String[] args) {
		String chuoi;
		int doDai;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao chuoi bat ky tuwf banf phims: ");
		chuoi = scanner.nextLine();
		doDai = chuoi.length();
		System.out.println("Do dai chuoi da nhap la: " + doDai);
	}

}
