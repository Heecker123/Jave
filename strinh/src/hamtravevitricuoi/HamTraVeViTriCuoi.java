package hamtravevitricuoi;
import java.util.Scanner;

public class HamTraVeViTriCuoi {
	/*
	 * Hàm trả về vị trí xuất hiện cuối cùng của một chuỗi trong chuỗi khác.
	 * Cú pháp: int result = string1.lastIndexOf(String string2);
	 * Chức năng: Hàm trả về vị trí xuất hiện cuối cùng của chuỗi string2 trong string1.
	 * Nếu chuỗi string2 không có trong chuỗi string1 thì kết quả trả về result = -1.
	 */
	public static void main(String[] args) {
		String chuoi1;
		String chuoi2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi 1: ");
		chuoi1 = scanner.nextLine();
		System.out.println("Nhap chuoi 2: ");
		chuoi2 = scanner.nextLine();
		int result;
		result = chuoi1.lastIndexOf(chuoi2);
		System.out.println("Vi tri cuoi cua chuoi 2 trong chuoi 1 la: " + result);
	}

}
