package strinh3;
import java.util.Scanner;
public class Strinhvd4 {
/*
 * Hàm nối 2 chuỗi ký tự: 
 * Cú pháp: String chuoi3 = chuoi1.concat(String chuoi2); => chuoi3 = chuoi1 + chuoi2;
 */
	public static void main(String[] args) {
		String chuoi1 = "Con me ";
		String chuoi2 = new String("may");
		String chuoi3 = chuoi1.concat(chuoi2);
		System.out.println("Ket qua cua 2 chuoi sau khi noi la: " + chuoi3);
	}

}
