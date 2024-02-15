package nhapxuat;
	/*
	 * System.out là chuẩn đầu ra 
	 * System.err dùng đề hiển thị thông báo lỗi trong Java 
	 * System.in là chuẩn đầu vào trong Java
	 */
import java.util.Scanner;
/*
 * Scanner là một lớp trong gói java.util. Nó được dùng để nhập và xuất dữ liệu (Số, ký tự và chuỗi,...) trong java
 * Để sử dụng Scanner, ta cần phải import nó vào trong Project như trên
 *  
 */
public class NhapXuat {
	public static void main(String[] args) {
		String ten;	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao chuoi: "); // Hiển thị dòng thông báo và xuống dòng 
		ten = scanner.nextLine();
		/*
		 * Để sử dụng các phương thức của lớp Scanner thì ta cần có đối tượng(Object), cách taoj đối tượng Scanner trong java như sau: 
		 * Scanner scanner = new Scanner(System.in); (Trong đó System.in là chuẩn đầu vào trong java)
		 * Tiếp theo, dòng lệnh scanner.nextLine(); Trả về kết quả nôij dung chuỗi mà ta đã nhập vào và gán kết quả đó vào 
		 * biến "ten" và xuất giá trị của biến này ra cửa số concole bằng câu lệnh: System.out.println("Chao mung ban "+ ten+ " den voi Freetuts.net!");  
		 */
		//Hiển thị chuỗi
		System.out.println("Chào mừng bạn " + ten + " đến với Freetuts.net!");
	}
}
