package pp;

public class pp7 {
	static void re(char a[]) {
		for(int i=0;i<a.length;i++)
			if(a[i]==' ')
				a[i]=',';
		
	}
	static void pr(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		pr(c);
		re(c);
		pr(c);
	}

}
