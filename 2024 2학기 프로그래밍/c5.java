package cccc;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]= {{90,90,110,110},{120,110,100,110},{120,140,130,150}};
		double year[]=new double[intArray.length];
		double quarter[]=new double[intArray[0].length];
		
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++)
				year[i]+=intArray[i][j];
		
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++)
				quarter[j]+=intArray[i][j];
		
		for(int i=0;i<intArray.length;++i)
			System.out.println((i+1)+"차년도 매출 총합은"+year[i]+"입니다");
		
		for(int j=0;j<intArray[0].length;++j)
			System.out.println(intArray.length+"년간"+(j+1)+"분기 총합은"+quarter[j]+"입니다");
	}

}
