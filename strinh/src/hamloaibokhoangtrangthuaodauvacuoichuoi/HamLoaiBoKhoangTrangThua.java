package hamloaibokhoangtrangthuaodauvacuoichuoi;
import java.util.Scanner;
public class HamLoaiBoKhoangTrangThua {
	/*
	 * Cú pháp: String string1 = string1.trim();
	 * Chức năng: Hàm sẽ loại bỏ các khoảng trắng thừa ở đầu và cuối chuỗi string1. 
	 * Nếu chuỗi đó không có khoảng trắng thừa thì chương trình sẽ trả về chuỗi gốc.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi 1: ");
		string1 = scanner.nextLine();
		System.out.println("Chuoi 1 sau khi da loai bo cac khoang trang thua la: " + string1);
	}

}
