package cccc;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]= { {90,90,110,120},
				{120,110,100,100},
				{120,140,130,150}};
		for(int i=0;i<intArray.length;i++) {
			for(int j=0; j<intArray[i].length;j++)
				System.out.print(intArray[i][j]+"");
			System.out.println();
		}
	}

}
