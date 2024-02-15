package vidu1;
import java.util.Scanner;
public class ViDu1 {
	/*
	 * Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự bất kỳ. 
	 * Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1;
		int a = 0;
		char cha;
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Nhap chuoi: ");
		string1 = s.nextLine();
		} while (string1.length() > 80);
		System.out.println("Nhap ky tu: ");
		cha = s.next().charAt(0);
		for (int i=0;i<string1.length();i++) {
			if (string1.charAt(i) == cha) a++;
		}
		System.out.println("So lan xuat hien cua ky tu " + cha + " trong chuoi 1 la: " + a);
	}

}
