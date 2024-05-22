package wret;

import java.util.Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]a1= {'J','a','v','a',};
		char[]a2=Arrays.copyOf(a1,a2.length);
		System.out.println(a2);
		String[]sa= {"케이크","애플","도넛","바나나"};
		print(sa);
		
		Arrys.sort(sa);
		print(sa);
		
		System.out.println(Arrays.binarySearch(sa,"애플"));
		
		Arrays.fill(sa,2,4,"기타");
		print(sa);
	}
	static void print(Objet[]oa) {
		for(Object o : oa)
			System.out.println(o+" ");
		System.out.println();
	}

}
