package hamtravevitrixuathiendautiencuamotchuoitrongchuoikhac;
import java.util.Scanner;
public class HamTraVeViTriDauTienCuaMotChuoiTrongChuoiKhac {
	/*
	 * Cú pháp: int result = string1.indexOf(String string2);
	 * Chức năng: Hàm trả về vị trí xuất hiện đầu tiên của chuỗi string2 trong chuỗi string1 nếu không 
	 * có trong chuỗi string1 thì kết quả trả về result = -1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		String string1;
		String string2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi 1: ");
		string1 = scanner.nextLine();
		System.out.println("nhap chuoi 2: ");	
		string2 = scanner.nextLine();
		result = string1.indexOf(string2);
		System.out.println("Vi tri dau tien cua chuoi 2 xuat hien trong chuoi 1 la: " + result);
	}
}
