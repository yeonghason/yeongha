package rhk5;

import java.util.Scanner;

public class as4 {

	public static void main(String[] args) {
		String AddressBayol[] = new String[5];
		int bayolCount = 0;

		
		Scanner in = new Scanner(System.in);

		System.out.print("URL을 입력하세요 : ");
		
		String UrlScan = in.next();
		AddressBayol[bayolCount] = UrlScan;
		while (AddressBayol[bayolCount].equalsIgnoreCase("bye") == false) {
			if (AddressBayol[bayolCount].endsWith("com") == true) {
				System.out.println(AddressBayol[bayolCount] + "은 'com'으로 끕납니다.");
				if (AddressBayol[bayolCount].contains("java") == true) {
					System.out.println(AddressBayol[bayolCount] + "은 'java'를 포함합니다.");
				}
			} else {
				System.out.println("'com'으로 끝나지도 'java'를 포함하지도 않습니다.");
			}
			System.out.print("URL을 입력하세요 : ");
			
			String UrlScan2 = in.next();
			bayolCount++;
			AddressBayol[bayolCount] = UrlScan2;
		}
	}
}