package cccc;

public class c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]=new int [5][];
		intArray[0]=new int[3];
		intArray[1]=new int[3];
		intArray[2]=new int[4];
		intArray[3]=new int[2];
		intArray[4]=new int[3];
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++)
				intArray[i][j]=(i+1)*10+(j*2);
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++)
				System.out.print(intArray[i][j]+"");
			System.out.println();
		}
	}

}
