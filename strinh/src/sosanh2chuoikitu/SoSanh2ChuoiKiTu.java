package sosanh2chuoikitu;

public class SoSanh2ChuoiKiTu {
	/*
	 * Hàm so sánh 2 chuỗi ký tự:
	 * Cú pháp: int result = string1.compareTo(String string2);
	 * Chức năng: Hàm có tác dụng so sánh hai chuỗi string1, string2 và trả về kết quả:
	 * Nếu result = 0 thì hai chuỗi đó bằng nhau.
	 * Nếu result < 0 thì chuỗi string1 < string2.
	 * Nếu result > 0 thì chuỗi string1 > string2.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi1 = "Hepi niu dia?zzz";
		String chuoi2 = new String("Hepi niu zia!");
		int result = chuoi1.compareTo(chuoi2);
		if (result == 0) System.out.println("Chuoi 1 bang chuoi 2");
		else if (result > 0) System.out.println("Chuoi 1 lon hon chuoi 2");
		else System.out.println("Chuoi 1 nho hon chuoi 2, result = " + result);
		
	}
	
}

