package cccc;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]= { {90,90,110,110},
				{120,110,100,110},
				{120,140,130,150}};
		double sum=0;
		
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++)
				sum+=intArray[i][j];
		
		System.out.print("지난 3년간 매출 총핵은"+sum+"이며 연 평균 매출은"+sum/intArray.length+"입니다");
			
	}

}
