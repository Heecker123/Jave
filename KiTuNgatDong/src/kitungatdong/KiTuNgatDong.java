package kitungatdong;

public class KiTuNgatDong {
/*
 * \t	Chèn vào một khoảng trắng trong đoạn văn bản.
 *\b	Xóa lùi 1 ký tự trước \b trong đoạn văn bản. Có bao nhiêu ký tự \b thì sẽ xóa bấy nhiêu ký tự (chỉ hoạt động khi có chuỗi tồn tại phía trước và phía sau \b).
 *\n	Chèn một dòng mới trong đoạn văn bản.
 *\r	Thay thế các ký tự trước \r bằng số các ký tự phía sau \r
 *\'	Chèn vào dấu nháy đơn trong đoạn văn bản.
 *\"	Chèn vào dấu nháy kép trong đoạn văn bản.
\\	Chèn vào dấu \ trong đoạn văn bản.
 */
	public static void main(String[] args) {
		 System.out.println("Tab: " + "Welcome\tto Freetuts!");
	     System.out.println("Backspace: " + "Welcome to\b Freetuts!");
	     System.out.println("New line: " + "Welcome\nto Freetuts!"); 
	     System.out.println("Welcome to\rFreetuts!"); // /r
	     System.out.println("Single quote: " + "Welcome to\'Freetuts!");
	     System.out.println("Double quote: " + "Welcome to\''Freetuts!");
	     System.out.println("Backslash: " + "Welcome to\\Freetuts!");
	}

}
	