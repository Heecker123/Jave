package hamtaomotchuoicontuvitriindextrongchuoicha;
import java.util.Scanner;
public class HamTaoChuoiConTuChuoiCha {
	/*
	 * Cú pháp:  
	 * String chuoiCon = chuoiCha.substring(int beginIndex);
	 * String chuoiCon = chuoiCha.substring(int beginIndex, int endIndex);
	 */
public static void main(String[] args) {
	String string1;
	int index;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap chuoi 1: ");
	string1 = scanner.nextLine();
	System.out.println("Nhap so index: ");
	index = scanner.nextInt();
	String chuoi2 = string1.substring(index);	
	System.out.println("chuoi con duoc tao ra sau do la: " + chuoi2);
}
}
