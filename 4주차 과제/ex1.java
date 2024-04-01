package rhk4;

class Printer {
	int numOfPapers = 0;              

	public void print(int amount) {   
        System.out.println("출력할 장 수 : " + amount);
		numOfPapers -= amount;        
	}
}


public class ex1 {
	public static void main(String[] args) {
		
		Printer demoPrinter = new Printer();   

		System.out.println("현재 용지 수 : " + demoPrinter.numOfPapers);
		demoPrinter.numOfPapers = 100;        
		System.out.println("용지 추가 수 : " + demoPrinter.numOfPapers);
		demoPrinter.print(70);            

		System.out.println("남아 있는 용지 : " + demoPrinter.numOfPapers);
	}
}